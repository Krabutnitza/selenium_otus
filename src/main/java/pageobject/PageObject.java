package pageobject;

import org.openqa.selenium.WebDriver;

public abstract class PageObject {
  protected WebDriver driver;

  public PageObject(WebDriver driver) {
    this.driver = driver;
  }
}
