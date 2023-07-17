package com.otus.pages;

import com.otus.guicescoped.GuiceScoped;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.inject.Inject;

public class CategoryPage extends BasePage {

  @Inject
  public CategoryPage(GuiceScoped guiceScoped) {
    super(guiceScoped);
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
