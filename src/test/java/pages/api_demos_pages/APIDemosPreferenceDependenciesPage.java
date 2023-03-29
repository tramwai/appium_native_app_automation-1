package pages.api_demos_pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class APIDemosPreferenceDependenciesPage extends BasePage{
    public APIDemosPreferenceDependenciesPage(){
        super();
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public AndroidElement WIFICheckBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    public AndroidElement WIFISettings;
}
