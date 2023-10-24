package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import tools.ElementActions;

public class ShopDetailsPage {

    private AppiumDriver appiumDriver;
    private ElementActions elementActions;

    private By addPizza = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout");
    private By loginBtn = AppiumBy.id("com.aisavent.hungrynaki:id/okayButton");

    public ShopDetailsPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        elementActions = new ElementActions(appiumDriver);
    }

    public void clickAddPizza(){
        elementActions.doClick(addPizza);
    }

    public void clickLogin(){
        elementActions.doClick(loginBtn);
    }

}
