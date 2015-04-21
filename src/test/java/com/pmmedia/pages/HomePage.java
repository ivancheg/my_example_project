package com.pmmedia.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Sample page
 */
public class HomePage extends Page {

    public String title = "Genymotion";

    @FindBy(id = "aside-menu")
    public WebElement menu;

    @FindBy(id = "")
    public WebElement singIn;

    public HomePage(AppiumDriver driver) {
        super(driver);
    }
}
