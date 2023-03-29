package pages.api_demos_pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApiDemosAnimationsPage extends BasePage {

    public ApiDemosAnimationsPage(){
        super();
    }

    @AndroidFindBy(accessibility = "Shake")
    public AndroidElement shakeOption;
}
