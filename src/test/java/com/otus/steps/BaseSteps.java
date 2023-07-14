package com.otus.steps;

import com.otus.guicescoped.GuiceScoped;
import com.otus.pages.BasePage;
import com.otus.pajeobject.AbsPageObject;
import io.cucumber.java.ru.И;

import javax.inject.Inject;

public class BaseSteps extends AbsPageObject {
    @Inject
    public BaseSteps(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    @И("^Открыта главная страница$")
    public void openMainPage() {
        new BasePage(driver).open();
    }
}
