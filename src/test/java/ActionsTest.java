//import driver.DriverFactory;
//import exceptions.DriverNotSupportedException;
//import mouselistene.MouseListener;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
//import pages.CategoryPage;
//
//public class ActionsTest {
//  private EventFiringWebDriver driver = null;
//
//  @BeforeEach
//  public void beforeEach() throws DriverNotSupportedException {
//    this.driver = (EventFiringWebDriver) new DriverFactory().getDriver();
//    driver.register(new MouseListener());
//  }
//
//  @AfterEach
//  public void afterEach() {
//    if (driver != null) {
//      driver.close();
//      driver.quit();
//    }
//  }
//  @Test
//  public void actionsTest() {
//    new CategoryPage(driver).openProgrammingCoursePage();
//    new CategoryPage(driver).dragAndDropElement();
//  }
//}
