package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import tools.ElementActions;

public class ShopPage {
    private AppiumDriver appiumDriver;
    private ElementActions elementActions;
    private By pizzaSelect = AppiumBy.xpath("//android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[1]");

    public ShopPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        elementActions = new ElementActions(appiumDriver);
    }

    public ShopDetailsPage selectPizzaShop(){
        elementActions.doClick(pizzaSelect);
        return new ShopDetailsPage(appiumDriver);
    }
}
