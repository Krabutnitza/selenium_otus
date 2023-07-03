package po;

import org.openqa.selenium.WebDriver;

// этот класс должен был называться PageObject, но идея почему-то ругается на это название и не дает запустить тесты
public class Po {
  protected WebDriver driver;

  public Po(WebDriver driver) {
    this.driver = driver;
  }
}
