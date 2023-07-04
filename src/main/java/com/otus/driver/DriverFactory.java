package com.otus.driver;

import com.otus.exceptions.DriverNotSupportedException;
import org.openqa.selenium.WebDriver;

public class DriverFactory implements IDriverFactory {

    private String browserType = System.getProperty("browser");


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
