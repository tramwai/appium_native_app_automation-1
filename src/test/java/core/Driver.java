package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.util.concurrent.TimeUnit;

public class Driver extends Environment {
    private Driver() {}

    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> getDriver() {
        if (driver == null) {
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            if (platformName.equalsIgnoreCase("android")) {
                driver = new AndroidDriver<>(appiumURL, caps);
            }
            driver.manage().timeouts().implicitlyWait(implicitTime, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}