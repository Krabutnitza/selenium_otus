package com.otus.pages;

import com.otus.guicescoped.GuiceScoped;
import com.otus.pajeobject.AbsPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends AbsPageObject {
    public MainPage(WebDriver driver) {
        super((GuiceScoped) driver);
    }

    List<WebElement> courses = driver.findElements(By.xpath("//div[@class=\"lessons\"]/a"));

    public WebElement getCourse(String courseName) {
        WebElement targetCourse = null;
        for (WebElement el : courses) {
            if (courseName.equals(el.findElement(By.xpath("//div[contains(@class, \"lessons__new-item-title\")]")).getText().trim())) {
                targetCourse = el;
            }
        }
        return targetCourse;
    }
}
