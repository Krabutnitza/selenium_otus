package hooks;

import driver.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver;

    @BeforeEach
    public void beforeEach(){
        DriverManager driverManager = new DriverManager();
        driverManager.driver =  new DriverManager().getWebDriver("chrome");
        this.driver = driverManager.driver;
    }

    @AfterEach
    public void afterEach() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}

