package com.otus.pages;

import com.otus.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CategoryPage extends BasePage {

  public CategoryPage(WebDriver driver) {
    super(driver);
  }

  public void openProgrammingCoursePage() {
    driver.get("https://otus.ru/categories/programming/");
  }

  public void dragAndDropElement() {
    WebElement elementButtonsBlock = driver.findElement(By.xpath("//div[@style=\"cursor:ew-resize\"]"));

    WebElement charElement1 = elementButtonsBlock.findElement(By.xpath("//div[@aria-valuenow=\"15\"]"));
    WebElement charElement2 = elementButtonsBlock.findElement(By.xpath("//div[@aria-valuenow=\"0\"]"));

    Actions actions = new Actions(driver);
    actions
            .clickAndHold(charElement2)
            .moveToElement(charElement1, 1, 5)
            .click()
            .build().perform();
  }
}
