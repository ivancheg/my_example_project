package com.pmmedia;

import com.pmmedia.util.PropertyLoader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.Capabilities;

import java.net.URL;

/**
 * Base class for all the JUnit-based test classes
 */
public class JUnitTestBase {

    protected static String appiumAndroidHub;
    protected static String appiumIOSHub;

    protected static String baseUrl;

    protected static Capabilities iosCapabilities;
    protected static Capabilities androidCapabilities;


    protected static AppiumDriver androidDriver;
    protected static AppiumDriver iosDriver;

    //Before and after each class in suite
    @ClassRule
    public static ExternalResource appiumDriverProperties = new ExternalResource() {

        @Override
        protected void before() throws Throwable {
            baseUrl = PropertyLoader.loadProperty("site.url");
            appiumIOSHub = PropertyLoader.loadProperty("appiumServerForIos.url");
            appiumAndroidHub = PropertyLoader.loadProperty("appiumServerForAndroid.url");

            //load simalator capabilities
            androidCapabilities = PropertyLoader.loadAndroidCapabilities();
            iosCapabilities = PropertyLoader.loadIosCapabilities();

            //load simulators and create driver
            androidDriver = new AndroidDriver(new URL(appiumAndroidHub), androidCapabilities);
            iosDriver = new IOSDriver(new URL(appiumIOSHub), iosCapabilities);

        }

        @Override
        protected void after() {
            androidDriver.quit();
            iosDriver.quit();
        }
    };


}
