package com.otus.guicescoped;

import com.otus.driver.DriverFactory;
import com.otus.exceptions.DriverNotSupportedException;
import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

@ScenarioScoped
public class GuiceScoped {
    public WebDriver driver = new DriverFactory().getDriver();

    public GuiceScoped() throws DriverNotSupportedException {
    }
}
