package pages.api_demos_pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApiDemosVerticesPage extends BasePage {

    public ApiDemosVerticesPage(){
        super();
    }

    @AndroidFindBy(className = "android.view.View")
    public AndroidElement image;

    @AndroidFindBy(className = "android.widget.TextView")
    public AndroidElement title;
}