package tools;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementActions {

    private AppiumDriver appiumDriver;

    public ElementActions(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
    }

    public void doClick(By element){
        appiumDriver.findElement(element).click();
    }
}
