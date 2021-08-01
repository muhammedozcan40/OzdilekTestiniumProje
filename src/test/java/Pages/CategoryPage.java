package Pages;

import Base.BaseMethods;
import com.thoughtworks.gauge.Logger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CategoryPage extends BaseMethods {

    public CategoryPage(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }


    public void checkCategoryPage() throws InterruptedException{
        waitForSecond(2);
        checkPage("com.ozdilek.ozdilekteyim:id/recyclerCategories");
        Logger.info("Kategori sayfasindasiniz...");
    }
    public void clickWomanButton() throws InterruptedException{
        waitForSecond(2);
        clickXpath("//*[@text='Kadın']");
        Logger.info("Kadin  butonuna tiklanildi...");
    }
    public void clickTrouserButton() throws InterruptedException{
        waitForSecond(2);
        clickXpath("//*[@text='Pantolon']");
        Logger.info("Pantolon butonuna tiklanildi...");
    }
    public void scrollBottom() throws InterruptedException{
        waitForSecond(3);
        scrollForwardBottom();
        Logger.info("Sayfanin en altina kadar swipe islemi yapildi");
    }
    public void clickLastProduct() throws InterruptedException{
        waitForSecond(2);
        clickXpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/recyclerView']" +
                "/android.widget.FrameLayout[last()]" +
                "/android.view.ViewGroup/android.widget.ImageView[last()]");
        Logger.info("En alttaki ürün favorilere eklendi");
    }
    public void clickBasketButton() throws InterruptedException{
        waitForSecond(2);
        clickId("com.ozdilek.ozdilekteyim:id/nav_cart");
        Logger.info("Sepetim butonuna tiklanildi");
    }

}
