package pages;

import org.openqa.selenium.WebDriver;
import po.Po;

public class BasePage extends Po {

  public BasePage(WebDriver driver) {
    super(driver);
  }

  public String baseUrl = System.getProperty("webdriver.base.url", "https://otus.ru/");

  public void open() {
    driver.get(baseUrl);
  }
}
