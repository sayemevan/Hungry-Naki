package register;

import io.appium.java_client.AppiumDriver;


public class Driver {
    private static AppiumDriver APPIUM_DRIVER;

    public Driver(AppiumDriver APPIUM_DRIVER){
        this.APPIUM_DRIVER = APPIUM_DRIVER;
    }

    public static AppiumDriver getDriver(){
        return APPIUM_DRIVER;
    }
}
