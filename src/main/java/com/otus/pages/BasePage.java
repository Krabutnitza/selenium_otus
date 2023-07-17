package com.otus.pages;

import com.otus.guicescoped.GuiceScoped;
import com.otus.pajeobject.AbsPageObject;

import javax.inject.Inject;

public class BasePage extends AbsPageObject {
    @Inject
    public BasePage(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    public String baseUrl = System.getProperty("webdriver.base.url", "https://otus.ru/");

    public void open() {
        driver.get(baseUrl);
    }
}
