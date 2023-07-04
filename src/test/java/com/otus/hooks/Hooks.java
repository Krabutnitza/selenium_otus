package com.otus.hooks;

import com.google.inject.Inject;
import com.otus.guicescoped.GuiceScoped;
import io.cucumber.java.After;

public class Hooks {
    @Inject
    private GuiceScoped guiceScoped;

    @After
    public void afterEach() {
        if (guiceScoped.driver != null) {
            guiceScoped.driver.close();
            guiceScoped.driver.quit();
        }
    }
}
