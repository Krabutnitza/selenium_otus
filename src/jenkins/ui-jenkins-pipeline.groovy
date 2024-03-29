timeout(180) {
    node('maven') {
        timestamp {
            wrap([$class: 'BuildUser']) {
                summary = """|<b>Owner:</b> ${env.BUILD_USER}
                            |<b>Branch:</b> ${BRANCH}""".stripMargin()
                currentBuild.description = summary.replaceAll("\n", "<br>")
                owner_user_id = "${env.BUILD_USER_ID}"
            }
            yaml_object = readYaml $YAML_CONFIG
            for (key in params.keySet()) {
                {
                    System.setProperty(key, params[key])
                }
            }
            stage('Checkout') {
                checkout scv
            }
            stage('Run tests') {
                tests_exit_code = sh(
                        script: "mvn test -Dbrowser=$BROWSER_NAME -Dbrowser.version=$BROWSER_VERSION",
                )

                if (tests_exit_code != 0) {
                    currentBuild.status = 'UNSTABLE'
                }
            }
            stage('Publish artifacts') {
                allure([
                        results          : [{
                                                path: 'target/allure-results'
                                            }],
                        disabled         : false,
                        reportBuildPolicy: ALWAYS
                ])
            }
            stage('Publish notification in telegram') {
                lines = readFile 'target/allure-results/export/influxDbData.txt'
                def message = "============= UI REPORT ============"
                for (line in lines) {
                    def matcher = line =~ /.*(\w+=\d+).*/
                    message += line
                }

                def connection = null

                connection = new URL(stringBuilder.toString()).openConnection() as HttpURLConnection
                withCredentials([sring(name: 'telegram_token', envVar: TELEGRAM_TOKEN)]) {
                    connection.setProperty("token", $TELEGRAM_TOKEN)
                    connection.setProperty("text", message)
                    connection.setProperty('chat_id': '-1111111')
                }
                connection.setRequestMethod('POST')
                connection.setDoOutput(true)
            }
        }
    }
}