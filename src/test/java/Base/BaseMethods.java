package Base;

import com.thoughtworks.gauge.Logger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.junit.Assert;


import java.time.Duration;

public class BaseMethods extends BaseSettings {
    protected static AppiumDriver<MobileElement> appiumDriver;

    public BaseMethods(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }


    public void waitForSecond(int x) throws InterruptedException {
        Thread.sleep(1000 * x);
        Logger.info(x + " saniye bekleniyor...");
    }

    public void clickId(String id) {

        appiumDriver.findElement(By.id(id)).click();

    }

    public void clickXpath(String xpath) {

        appiumDriver.findElement(By.xpath(xpath)).click();

    }

    public void checkPage(String id) {
        Assert.assertNotNull("acilmadii", appiumDriver.findElement(By.id(id)));

    }

    public void scrollForwardBottom() throws InterruptedException {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int xStart = (int) (dimension.width * 0.5);
        int yStart = (int) (dimension.height * 0.8);
        Thread.sleep(100);
        int xEnd = (int) (dimension.width * 0.5);
        int yEnd = (int) (dimension.height * 0.2);
        Thread.sleep(100);
        for (int i = 0; i < 40; i++) {
            TouchAction action =
                    new TouchAction((PerformsTouchActions) appiumDriver)
                            .press(PointOption.point(xStart, yStart))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                            .moveTo(PointOption.point(xEnd, yEnd))
                            .release().perform();


        }

    }
}
