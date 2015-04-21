package com.pmmedia.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

  protected AppiumDriver driver;

/**constructor***/
  public Page(AppiumDriver driver) {
    this.driver = driver;
      loadPage();
  }

  public String getTitle() {
    return driver.getTitle();
  }

    public void loadPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
