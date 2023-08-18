package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class MyMethods {

    public WebDriverWait wait = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(10));

    public void clickMethod(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void sendKeysMethod(WebElement element, String text){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void assertText(WebElement element, String text){
        waitUntilVisible(element);
       // Assert.assertTrue(element.getText().contains(text));
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void javaScriptClick(WebElement element) {
        scrollToElement(element);
        JavascriptExecutor executor = (JavascriptExecutor) BaseDriver.driver;
        executor.executeScript("arguments[0].click();", element);
    }


}
