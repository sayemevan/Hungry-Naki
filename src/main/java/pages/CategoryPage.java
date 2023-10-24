package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import tools.ElementActions;

public class CategoryPage {

    private ElementActions elementActions;
    private AppiumDriver appiumDriver;

    private By pizzaCategory = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");

    public CategoryPage(AppiumDriver appiumDriver){
        elementActions = new ElementActions(appiumDriver);
        this.appiumDriver = appiumDriver;
    }

    public ShopPage selectPizzaCat(){
        elementActions.doClick(pizzaCategory);
        return new ShopPage(appiumDriver);
    }
}
