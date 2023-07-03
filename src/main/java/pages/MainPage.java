package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends BasePage {
  public MainPage(WebDriver driver) {
    super(driver);
  }

  List<WebElement> courses = driver.findElements(By.xpath("//div[@class=\"lessons\"]/a"));

  public WebElement getCourse(String courseName) {
    WebElement targetCourse = null;
    for (WebElement el : courses) {
      if (courseName.equals(el.findElement(By.xpath("//div[contains(@class, \"lessons__new-item-title\")]")).getText().trim())) {
        targetCourse = el;
      }
    }
    return targetCourse;
  }
}
