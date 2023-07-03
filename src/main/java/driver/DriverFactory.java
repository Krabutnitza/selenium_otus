package driver;

import exceptions.DriverNotSupportedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class DriverFactory implements IDriverFactory {

  private String browserType = System.getProperty("browser");


  @Override
  public WebDriver getDriver() throws DriverNotSupportedException {
    switch (this.browserType) {
      case "chrome": {
        return new EventFiringWebDriver(new ChromeWebDriver().newDriver());
      }
      default:
        throw new DriverNotSupportedException(this.browserType);
    }
  }
}
