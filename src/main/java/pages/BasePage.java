package pages;

import org.openqa.selenium.WebDriver;
import pageobject.PageObject;

public abstract class BasePage extends PageObject {

  public BasePage(WebDriver driver) {
    super(driver);
  }

  public String baseUrl = System.getProperty("webdriver.base.url", "https://otus.ru/");

}
