package scripts.api_demos_apk_app;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.api_demos_pages.*;

import java.util.stream.IntStream;

import static utililities.ElementActions.*;
import static texts.ExpectedTexts.*;


public class _01_Android_First_Test extends Base {

    @BeforeMethod
    public void setPages() {
        apiDemosLandingPage = new APIDemosLandingPage();
        apiDemosPreferencePage = new APIDemosPreferencePage();
        apiDemosPreferenceDependenciesPage = new APIDemosPreferenceDependenciesPage();
        apiDemosAccessibilityPage = new ApiDemosAccessibilityPage();
        apiDemosViewsPage = new ApiDemosViewsPage();
        apiDemosAnimationsPage = new ApiDemosAnimationsPage();
        apiDemosShakePage = new ApiDemosShakePage();
        apiDemosVerticesPage = new ApiDemosVerticesPage();
    }

    /**
     * Test Case: Verify enabling Wi-Fi in API Demo app's Preference Dependencies
     * 1. Launch the API Demo app.
     * 2. Verify that the "API Demos" header is displayed.
     * 3. Tap on the "Preference" menu item.
     * 4. Tap on the "Preference dependencies" option.
     * 5. Tap on the "Wi-Fi" checkbox.
     * 6. Validate that the Wi-Fi checkbox is enabled.
     */

    @Test(priority = 1)
    public void demoApkFile() {
        Assert.assertTrue(apiDemosLandingPage.APIDemosHeader.isDisplayed());
        clickOnElementInAList(apiDemosLandingPage.mainMenuItems, "Preference");
        clickOnElementInAList(apiDemosPreferencePage.preferencesMenuItems, "3. Preference dependencies");
        clickOnElement(apiDemosPreferenceDependenciesPage.WIFICheckBox);
        Assert.assertTrue(apiDemosPreferenceDependenciesPage.WIFISettings.isEnabled());
    }

    /**
     * Test Case: Verify "Custom View" in Accessibility menu is displayed
     * 1. Launch the API Demo app.
     * 2. Tap on the "Accessibility" menu item.
     * 3. Validate that the "Custom View" option is displayed.
     */

    @Test(priority = 2)
    public void demoCustomView() {
        clickOnElementInAList(apiDemosLandingPage.mainMenuItems, "Accessibility");
        Assert.assertTrue(apiDemosAccessibilityPage.accessibilityMenuItems.get(0).isDisplayed());
    }

    /**
     * Test Case: Verify "Shake" input box
     * 1. Launch the API Demo app.
     * 2. Tap on the "Views" menu item.
     * 3. Tap on the "Animations" option.
     * 4. Tap on the "Shake" option.
     * 5. Validate that the input box is displayed.
     */

    @Test(priority = 3)
    public void demoValidateInputBox() {
        clickOnElementInAList(apiDemosLandingPage.mainMenuItems, "Views");
        clickOnElementInAList(apiDemosViewsPage.viewsMenuItems, "Animation");
        clickOnElement(apiDemosAnimationsPage.shakeOption);
        Assert.assertTrue(apiDemosShakePage.inputBox.isDisplayed());
    }

    /**
     * Test Case: Verify Menu items
     * 1. Launch the API Demo app.
     * 2. Verify all the menu item texts with the expected texts.
     */

    @Test(priority = 4)
    public void validateMainMenu() {

        IntStream.range(0, apiDemosLandingPage.mainMenuItems.size()).forEach(i ->
                Assert.assertEquals(apiDemosLandingPage.mainMenuItems.get(i).getText(), menu_items[i])
        );
    }

    /**
     * Test Case: Tap and Scroll
     * 1. Launch the API Demo app.
     * 2. Tap on the "Graphics" menu item.
     * 3. Scroll down and Click "Vertices" menu item.
     * 4. Validate picture is displayed.
     * 5. Validate that title is "Graphics/Vertices".
     */

    @Test
    public void scrollDownAndTap(){
        clickOnElementInAList(apiDemosLandingPage.mainMenuItems, "Graphics");
        scrollAndClick(driver, "Vertices");
        Assert.assertTrue(apiDemosVerticesPage.image.isDisplayed());
        Assert.assertEquals(apiDemosVerticesPage.title.getText(), expected_title);
    }

    /**
     * Test Case: Tap and Scroll
     * 1. Launch the API Demo app.
     * 2. Tap on the coordinates "View" menu item.
     * 3. Tap on the coordinates "Expandable Lists" menu item.
     * 4. Tap on the coordinates "1. Custom Adapter" menu item.
     * 5. Press on "People Names" for 3 seconds
     * 6. Validate user can see "Sample menu"
     */

    @Test
    public void scrollByCoordinates(){
        // 1. Launch the API Demo app.
       pressByCoordinates(driver, 114, 1643, 1);
       //2. Tap on the coordinates "View" menu item.
       pressByCoordinates(driver, 99, 1357, 1 );
       // 3. Tap on the coordinates "Expandable Lists" menu item.
       pressByCoordinates(driver, 120, 280, 1 );
       // 4. Tap on the coordinates "1. Custom Adapter" menu item.
        // 5. Press on "People Names" for 3 seconds
        pressByCoordinates(driver, 170, 355, 3);
        // 6. Validate user can see "Sample menu"
        Assert.assertTrue(elementByText(driver, "Sample menu").isDisplayed());
    }
}