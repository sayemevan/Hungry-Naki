package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import register.Data;
import register.Driver;
import register.Element;
import utilities.PropertyUtils;

import java.time.Duration;

public class ObjectVisibility {
    public static boolean assertVisibility(By webElement, String maxWaitTime){
        try {
            if(maxWaitTime == null){
                maxWaitTime = "NULL";
            }
            if (maxWaitTime.equals("NULL")) {
                final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(0));
                wait.until(ExpectedConditions.visibilityOf(Element.getElement(webElement)));
            } else if (maxWaitTime.equals("DEFAULT")) {
                final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(Data.DEFAULT_MAX_WAIT_TIME));
                wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
            } else {
                final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(Long.parseLong(maxWaitTime)));
                wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean assertInVisibility(By webElement, String maxWaitTime){
        try {
            if(maxWaitTime == null){
                maxWaitTime = "NULL";
            }
            if (maxWaitTime.equals("NULL")) {
                final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(0));
                wait.until(ExpectedConditions.invisibilityOf(Element.getElement(webElement)));
            } else if (maxWaitTime.equals("DEFAULT")) {
                final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(Data.DEFAULT_MAX_WAIT_TIME));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(webElement));
            } else {
                final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(Long.parseLong(maxWaitTime)));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(webElement));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
