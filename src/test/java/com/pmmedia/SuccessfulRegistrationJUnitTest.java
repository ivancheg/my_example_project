package com.pmmedia;

import com.pmmedia.pages.HomePage;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.junit.Test;


public class SuccessfulRegistrationJUnitTest extends JUnitTestBase {
    private HomePage homepage;
    AppiumDriver driver;

    public void initPageObjects(AppiumDriver driver) {
        homepage = new HomePage(driver);

    }


    @Test
    public void testHomePageHasAHeaderAndroid() throws InterruptedException {
        androidDriver.get(baseUrl);
        initPageObjects(androidDriver);
        Assert.assertTrue("There is not homepage, current page title is:"+androidDriver.getTitle()  ,homepage.title.equals(androidDriver.getTitle()));
        homepage.menu.click();
        Thread.sleep(10000);


    }

    @Test
    public void testHomePageHasAHeaderSafari() throws InterruptedException {
        iosDriver.get(baseUrl);
        initPageObjects(iosDriver);
        Assert.assertTrue("There is not homepage, current page title is:"+iosDriver.getTitle(), homepage.title.equals(iosDriver.getTitle()));
        homepage.menu.click();
        Thread.sleep(10000);

    }



}
