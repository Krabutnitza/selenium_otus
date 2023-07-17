package com.otus.steps;

import com.otus.guicescoped.GuiceScoped;
import com.otus.pages.BasePage;
import com.otus.pajeobject.AbsPageObject;
import io.cucumber.java.en.And;

import javax.inject.Inject;

public class BaseSteps extends AbsPageObject {
    @Inject
    public BaseSteps(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    @And("^Open main page$")
    public void openMainPage() {
        new BasePage(guiceScoped).open();
    }
}
