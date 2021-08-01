package Tests;

import Base.BaseSettings;
import Pages.CategoryPage;
import com.thoughtworks.gauge.Step;

public class CategoryTest extends BaseSettings {
    @Step({"Kategori sayfasının acildigi dogrulanir"})
    public void checkCategoryPageControl() throws InterruptedException{
        new CategoryPage(appiumDriver).checkCategoryPage();
    }
    @Step({"Menüden “Kadın” Seçeneğine tıklanır"})
    public void clickToWomanButton() throws InterruptedException{
        new CategoryPage(appiumDriver).clickWomanButton();
    }
    @Step({"“pantolon” kategorisi açılır"})
    public  void clickToTrouserButton() throws InterruptedException{
        new CategoryPage(appiumDriver).clickTrouserButton();
    }
    @Step({"Sayfanın en aşagasına gelene kadar swipe edilir"})
    public void swipeToBottom() throws InterruptedException{
        new CategoryPage(appiumDriver).scrollBottom();
    }
    @Step({"Ekranda ki son ürün için favoriye ekleme butonuna tıklanır."})
    public void clickToTheBottomProduct() throws  InterruptedException{
        new CategoryPage(appiumDriver).clickLastProduct();
    }
    @Step({"Sepetim butonuna tıklanir"})
    public void clickBasketButton() throws InterruptedException{
        new CategoryPage(appiumDriver).clickBasketButton();
    }


}
