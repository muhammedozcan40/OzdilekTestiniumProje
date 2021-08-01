package Pages;

import Base.BaseMethods;
import com.thoughtworks.gauge.Logger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class MainPage extends BaseMethods {

    public MainPage(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }
    public void checkHomePage() throws InterruptedException {
        waitForSecond(1);
        checkPage("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
        Logger.info("Ana sayfasindasiniz...");
    }
    public void clickStartShopping() throws InterruptedException {
        waitForSecond(1);
        clickId("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
        Logger.info("Alisverise basla butonuna tiklanildi");
    }

}
