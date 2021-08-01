package Pages;

import Base.BaseMethods;
import com.thoughtworks.gauge.Logger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ShoppingPage extends BaseMethods {

    public ShoppingPage(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }

    public void checkShoppingPage() throws InterruptedException {
        waitForSecond(2);
        checkPage("com.ozdilek.ozdilekteyim:id/relLayMarket");
        Logger.info("Alisveris sayfasındasınız...");
    }

    public void clickCategoryPage() throws InterruptedException {
        waitForSecond(2);
        clickId("com.ozdilek.ozdilekteyim:id/nav_categories");
        Logger.info("Kategoriler butonuna tiklanildi");
    }
}
