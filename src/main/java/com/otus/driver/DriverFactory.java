package com.otus.driver;

import com.google.inject.Inject;
import com.otus.exceptions.DriverNotSupportedException;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class DriverFactory implements IDriverFactory {

    private String browserType = "";

    @Inject
    public DriverFactory() {
        browserType = System.getProperty("browser", "chrome").toLowerCase(Locale.ROOT);
    }

    @Override
    public WebDriver getDriver() throws DriverNotSupportedException {
        switch (this.browserType) {
            case "chrome": {
                return new ChromeWebDriver().newDriver();
            }
            default:
                throw new DriverNotSupportedException(this.browserType);
        }
    }
}
