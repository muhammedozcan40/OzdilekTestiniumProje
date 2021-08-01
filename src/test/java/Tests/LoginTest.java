package Tests;

import Base.BaseSettings;
import Pages.LoginPage;

import com.thoughtworks.gauge.Step;


public class LoginTest extends BaseSettings {
    @Step({"Giris yapma sayfasinin acildigi dogrulanir."})
    public void loginPageControl() throws InterruptedException {
        new LoginPage(appiumDriver).checkLoginPage();
    }

    @Step({"geri butonuna tıklanır kampanyalar sayfasının tekrar açıldıgı kontrol edilir"})
    public void clickBackButtonAndCheckOfferPage() throws InterruptedException {
        new LoginPage(appiumDriver).clickBackButton();
        new LoginPage(appiumDriver).checkOfferPage();
    }

    @Step({"Hesabım butonuna tıklanır"})
    public void clickAccountPage() throws InterruptedException {
        new LoginPage(appiumDriver).clickAccountButton();
    }

    @Step({"Uygulama kapatılır"})
    public void closingMessage() throws InterruptedException {
        new LoginPage(appiumDriver).goodByeMessage();
    }

}
