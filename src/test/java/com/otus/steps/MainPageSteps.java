package com.otus.steps;

import com.otus.guicescoped.GuiceScoped;
import com.otus.pages.MainPage;
import com.otus.po.AbsPageObject;
import io.cucumber.java.bg.И;

import javax.inject.Inject;

public class MainPageSteps extends AbsPageObject {
    @Inject
    public MainPageSteps(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    @И("^Найти курс по фильтру '(.+)'$")
    public void filterCourseName(String courseName) {
        new MainPage(driver).getCourse(courseName);
    }
}
