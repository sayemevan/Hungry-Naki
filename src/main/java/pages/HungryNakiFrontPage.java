package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HungryNakiFrontPage {
    private AppiumDriver appiumDriver;
    private By allowBtn = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button");
    private By skipBtn = AppiumBy.id("com.aisavent.hungrynaki:id/intro_btn_skip");
}
