package Tests;

import Base.BaseSettings;
import Pages.MainPage;
import com.thoughtworks.gauge.Step;

public class HomeTest extends BaseSettings {
    @Step({"Anasayfanın açıldığı kontrol edilir"})
    public void homePageControl() throws InterruptedException {
        new MainPage(appiumDriver).checkHomePage();
    }

    @Step({"Alışverişe başla butonuna tıklanır"})
    public void clickStartShoppingButton() throws InterruptedException {
        new MainPage(appiumDriver).clickStartShopping();
    }


}
