package Pages;

import Base.BaseMethods;
import com.thoughtworks.gauge.Logger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BaseMethods {

    public LoginPage(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }


    public void checkLoginPage() throws InterruptedException {
        waitForSecond(2);
        checkPage("com.ozdilek.ozdilekteyim:id/btnLogin");
        Logger.info("Login sayfasindasiniz...");
    }

    public void clickBackButton() throws InterruptedException {
        waitForSecond(2);
        clickId("com.ozdilek.ozdilekteyim:id/ivBack");
        Logger.info("Geri Butonuna tiklanildi ");
    }

    public void checkOfferPage() throws InterruptedException {
        waitForSecond(2);
        checkPage("com.ozdilek.ozdilekteyim:id/recyclerView");
        Assert.assertNotNull("kampanya sayfasında değilsiniz", appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/recyclerView")));
        Logger.info("Kampanya sayfasindasiniz...");
    }

    public void clickAccountButton() throws InterruptedException {
        waitForSecond(2);
        clickId("com.ozdilek.ozdilekteyim:id/nav_account");
        Logger.info("Hesabım Butonuna tiklanildi ");
    }

    public void goodByeMessage() throws InterruptedException {
        waitForSecond(2);
        Logger.info("Tum testler bitti. Uygulama kapatiliyor... :)");
    }


}
