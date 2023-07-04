package com.otus.driver;

import com.otus.exceptions.DriverNotSupportedException;
import org.openqa.selenium.WebDriver;

public interface IDriverFactory {
  WebDriver getDriver() throws DriverNotSupportedException;
}
