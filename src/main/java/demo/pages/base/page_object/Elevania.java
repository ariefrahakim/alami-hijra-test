package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Elevania extends BasePageObject {

    public void popUpBannerClose() {
        By element = By.xpath("/html/body/div[3]/div[1]/div[2]/a");
        if (isPresent(element)) {
            clickOn(element);
        }
    }

    public void inputKomputer(String komputer) {
        By element1 = By.id("AKCKwd");
        typeOn(element1, komputer);
        By element2 = By.className("btn-search");
        clickOn(element2);
    }

    public void clickBestProduct() {
        By element = By.linkText("Produk terlaris");
        clickOn(element);
    }

    public void clickFirstProduct() throws InterruptedException {
        By element = By.linkText("JOYSEUS Wireless Mouse 1800DPI USB Computer 2.4GHz Mouse - MS0003");
        scrollDown();
        clickOn(element);
    }

    public boolean isTheDetailsOfProductShow() {
        By element = By.xpath("//h1[contains(text(),'JOYSEUS Wireless Mouse 1800DPI USB Computer 2.4GHz')]");
        return isPresent(element);
    }

    public void addItem(String item) {
        By element = By.id("optionStock0");
        clearText(element);
        typeOn(element, item);
    }

    public void addToCart() {
        By element = By.xpath("//a[contains(text(),'Tambahkan ke Cart')]");
        clickOn(element);
    }

    public void chooseYa() {
        By element = By.xpath("//body/section[1]/section[1]/form[1]/div[1]/div[3]/div[6]/div[2]/div[2]/a[1]");
        clickOn(element);
    }

    public boolean isTheDetailsOfCart() {
        By element = By.xpath("//thead/tr/th[2]");
        return isPresent(element);
    }

    public void changeKurir() {
        By element = By.xpath("//a[contains(text(),'Ubah Kurir')]");
        clickOn(element);
    }

    public void chooseCancel() {
        moveIFrame("ifrLayer");
        By element = By.cssSelector("section.openPopup.smallPop.kurirPop:nth-child(2) form:nth-child(1) article.popCon:nth-child(6) p.btnC > a.btnStyle.btnM.btnWGray:nth-child(2)");
        clickOn(element);
    }

    public void chooseDelete() {
        moveToDefaultIFrame();
        By element = By.linkText("Hapus");
        clickOn(element);
    }

    public void chooseOkDelete() {
        By element = By.id("chkDelPopY");
        clickOn(element);
    }

    public boolean isTheProductEmpty() {
        By element = By.xpath("//strong[contains(text(),'Tidak ada produk di Shopping Cart.')]");
        return isPresent(element);
    }
}
