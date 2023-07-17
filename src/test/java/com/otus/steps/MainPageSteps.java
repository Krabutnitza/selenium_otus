package com.otus.steps;

import com.otus.guicescoped.GuiceScoped;
import com.otus.pages.MainPage;
import com.otus.pajeobject.AbsPageObject;
import io.cucumber.java.en.Then;

import javax.inject.Inject;

public class MainPageSteps extends AbsPageObject {
    @Inject
    public MainPageSteps(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    @Then("^Find course by filter '(.+)'$")
    public void filterCourseName(String courseName) {
        new MainPage(guiceScoped).getCourse(courseName);
    }
}
