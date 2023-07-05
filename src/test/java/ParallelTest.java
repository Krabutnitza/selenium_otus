import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.BasePage;
import pages.MainPage;

import java.net.MalformedURLException;
import java.net.URI;

public class ParallelTest {
    private WebDriver driver;

    @Before
    public void init() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        capabilities.setCapability(CapabilityType.BROWSER_VERSION, "112.0");
        capabilities.setCapability("enableVNC", true);
        driver = new RemoteWebDriver(
                URI.create("http://localhost:4445/wd/hub").toURL(),
                capabilities
        );
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    public void filter_courses_test1() throws InterruptedException {
        new BasePage(driver).open();
        new MainPage(driver).getCourse("Специализация сетевой инженер");
        Thread.sleep(33000);
    }
    @Test
    public void filter_courses_test2() throws InterruptedException {
        new BasePage(driver).open();
        new MainPage(driver).getCourse("Delivery Manager");
        Thread.sleep(33000);
    }
    @Test
    public void filter_courses_test3() throws InterruptedException {
        new BasePage(driver).open();
        new MainPage(driver).getCourse("Apache Kafka");
        Thread.sleep(33000);
    }
    @Test
    public void filter_courses_test4() throws InterruptedException {
        new BasePage(driver).open();
        new MainPage(driver).getCourse("Administrator Linux. Professional");
        Thread.sleep(33000);
    }
    @Test
    public void filter_courses_test5() throws InterruptedException {
        new BasePage(driver).open();
        new MainPage(driver).getCourse("Специализация Java-разработчик");
        Thread.sleep(33000);
    }
}
