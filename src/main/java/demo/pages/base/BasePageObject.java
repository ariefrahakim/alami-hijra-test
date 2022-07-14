package demo.pages.base;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.*;

public class BasePageObject {

    public WebDriver getDriver() {
        return WebdriverInstance.webdriver;
    }

    public void clickOn(By element) {
        getDriver().findElement(element).click();
    }

    public void typeOn(By element, String text) {
        getDriver().findElement(element).sendKeys(text);
    }

    public void clearText(By element) {
        getDriver().findElement(element).clear();
    }

    public void scrollDown() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, 350)");
    }


//    public void scrollIntoView(By element) {
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("arguments[0].scrollIntoView();", element);
//    }

    public void moveIFrame(String elementId) {
        getDriver().switchTo().frame(elementId);
    }

    public void moveToDefaultIFrame(){
        getDriver().switchTo().parentFrame();
    }
    public boolean isPresent(By element) {
        return getDriver().findElement(element).isDisplayed();
    }
}
