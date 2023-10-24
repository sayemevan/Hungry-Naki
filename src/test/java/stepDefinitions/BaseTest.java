package stepDefinitions;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import register.Driver;
import tools.AppSpecificActions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    @Before
    public static void before_all() {
        AppSpecificActions.lunchApp();
        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");
    }

    @After
    public static void after_all() {
        AppSpecificActions.closeApp();
    }
}
