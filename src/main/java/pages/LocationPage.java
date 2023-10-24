package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LocationPage {
    private AppiumDriver appiumDriver;
    private By allowLocation = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    private By changeAddressBtn = AppiumBy.id("com.aisavent.hungrynaki:id/btnChangeAddAddress");
    private By searchInput = AppiumBy.id("com.aisavent.hungrynaki:id/layoutSearchAddress");
    private By dhakaSelect = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
    private By confirmLocation = AppiumBy.id("com.aisavent.hungrynaki:id/btnConfirmAddAddress");
}
