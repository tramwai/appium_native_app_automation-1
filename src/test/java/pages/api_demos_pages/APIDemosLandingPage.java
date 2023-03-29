package pages.api_demos_pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class APIDemosLandingPage extends BasePage {
    public APIDemosLandingPage(){
        super();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public AndroidElement APIDemosHeader;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1']")
    public List<AndroidElement> mainMenuItems;
}
