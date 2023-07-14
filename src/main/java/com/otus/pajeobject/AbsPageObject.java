package com.otus.pajeobject;

import com.google.inject.Inject;
import com.otus.guicescoped.GuiceScoped;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbsPageObject<T> {

    protected WebDriver driver;
    protected GuiceScoped guiceScoped;

    @Inject
    public AbsPageObject(GuiceScoped guiceScoped) {
        this.guiceScoped = guiceScoped;
        this.driver = guiceScoped.driver;

        PageFactory.initElements(guiceScoped.driver, this);
    }

}
