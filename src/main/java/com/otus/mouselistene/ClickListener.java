package com.otus.mouselistene;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public abstract class ClickListener implements WebDriverEventListener {
  @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
    ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red;'", element);
  }
}
