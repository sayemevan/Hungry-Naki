package tools;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import register.Data;
import register.Driver;

import java.net.URL;

public class AppSpecificActions {
    public static void lunchApp(){
        try {
            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName(Data.PLATFORM_NAME)
                    .setApp(Data.APP)
                    .setDeviceName(Data.DEVICE_NAME).setAppPackage(Data.APP_PACKAGE)
                    .setAppActivity(Data.APP_ACTIVITY)
                    .setNoReset(true)
                    .eventTimings();

            //Driver initialize
            new Driver(new AppiumDriver(new URL(Data.APPIUM_SERVER_URL), options));

            System.out.println("App lunched!");
        } catch (Exception e){
            System.out.println("App launch failed!");
            e.printStackTrace();
        }
    }

    public static void closeApp() {
        Driver.getDriver().quit();
    }
}
