package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    Actions driverAksiyon = new Actions(Driver.getDriver());

    public void myClick(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String yazi){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
    }

    public void verifyContainsText_Negative(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        driverAksiyon.sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myJsClick(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
    }
}
