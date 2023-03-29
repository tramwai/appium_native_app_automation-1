package core;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Environment {
    public static boolean appUnderTest;
    public static String androidApkPath;
    public static String platformName;
    public static String deviceName;
    public static String appPackage;
    public static String appActivity;
    public static int implicitTime;
    public static int explicitTime;
    protected static final DesiredCapabilities caps;
    public static URL appiumURL;

    static {
        caps = new DesiredCapabilities();
        appUnderTest = Boolean.parseBoolean(ConfigReader.getProperty("appUnderTest"));
        platformName = ConfigReader.getProperty("platformName");
        deviceName = ConfigReader.getProperty("deviceName");
        if(appUnderTest){
            androidApkPath = ConfigReader.getProperty("androidApkPath");
            caps.setCapability(MobileCapabilityType.APP, new File(androidApkPath).getAbsolutePath());
        }
        else{
            appPackage = ConfigReader.getProperty("appPackage");
            appActivity = ConfigReader.getProperty("appActivity");
        }
        implicitTime = Integer.parseInt(ConfigReader.getProperty("implicitWait"));
        explicitTime = Integer.parseInt(ConfigReader.getProperty("explicitWait"));
        try {
            appiumURL = new URL("http://127.0.0.1:4723/wd/hub/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
