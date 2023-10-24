package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Element {
    public static WebElement getElement(String searchedElementString) {
        return Driver.getDriver().findElement(getElementType(searchedElementString));
    }
    public static WebElement getElement(By searchedElement) {
        return Driver.getDriver().findElement(searchedElement);
    }
    public static List<WebElement> getElements(String searchedElementString) {
        return Driver.getDriver().findElements(getElementType(searchedElementString));
    }
    public static By getElementType(String searchedElementString){
        String[] splitedElementString = searchedElementString.split("~");
        if(splitedElementString[0].trim().equals("ID")){
            return By.id(splitedElementString[1]);
        } else if(splitedElementString[0].trim().equals("XPATH")){
            return By.xpath(splitedElementString[1]);
        } else if(splitedElementString[0].trim().equals("NAME")){
            return By.name(splitedElementString[1]);
        } else if(splitedElementString[0].trim().equals("CLASSNAME")){
            return By.className(splitedElementString[1]);
        } else {
            return null;
        }
    }
}
