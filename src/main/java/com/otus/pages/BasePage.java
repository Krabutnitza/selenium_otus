package com.otus.pages;

import com.otus.guicescoped.GuiceScoped;
import com.otus.pajeobject.AbsPageObject;
import org.openqa.selenium.WebDriver;

public class BasePage extends AbsPageObject {

    public BasePage(WebDriver driver) {
        super((GuiceScoped) driver);
    }

    public String baseUrl = System.getProperty("webdriver.base.url", "https://otus.ru/");

    public void open() {
        driver.get(baseUrl);
    }
}
