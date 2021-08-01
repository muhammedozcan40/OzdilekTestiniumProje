package Tests;

import Base.BaseSettings;
import Pages.ShoppingPage;
import com.thoughtworks.gauge.Step;

public class ShoppingTest extends BaseSettings {
    @Step({"Alisveris sayfasinin acıldığı dogrulanir"})
    public void shoppingPageControl() throws InterruptedException {
        new ShoppingPage(appiumDriver).checkShoppingPage();
    }

    @Step({"Kategoriler sayfasi acilir"})
    public void clickCategoryPageButton() throws InterruptedException {
        new ShoppingPage(appiumDriver).clickCategoryPage();
    }
}
