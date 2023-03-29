package pages.api_demos_pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApiDemosShakePage extends BasePage {

    public ApiDemosShakePage(){
        super();
    }

    @AndroidFindBy(id = "io.appium.android.apis:id/pw")
    public AndroidElement inputBox;
}
