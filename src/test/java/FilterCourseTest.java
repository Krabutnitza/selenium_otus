import driver.DriverFactory;
import exceptions.DriverNotSupportedException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.MainPage;

public class FilterCourseTest {
  private WebDriver driver;

  @BeforeEach
  public void init() throws DriverNotSupportedException {
    this.driver = new DriverFactory().getDriver();
  }

  @AfterEach
  public void afterEach() {
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }
  @Test
  public void filter_courses_test() {
    new MainPage(driver).open();
    new MainPage(driver).getCourse("Специализация сетевой инженер");
  }
}