package scripts.api_demos_apk_app;

import core.Driver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.api_demos_pages.*;


public class Base {
    public static AndroidDriver<AndroidElement> driver = null;

    APIDemosLandingPage apiDemosLandingPage;
    APIDemosPreferencePage apiDemosPreferencePage;
    APIDemosPreferenceDependenciesPage apiDemosPreferenceDependenciesPage;
    ApiDemosAccessibilityPage apiDemosAccessibilityPage;
    ApiDemosViewsPage apiDemosViewsPage;
    ApiDemosAnimationsPage apiDemosAnimationsPage;
    ApiDemosShakePage apiDemosShakePage;

    @BeforeMethod
    public void setDriver(){
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}
