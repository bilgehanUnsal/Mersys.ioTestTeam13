package Bilgehan.Pages;

import Pages.Parent;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavBilge extends Parent {
    public LeftNavBilge() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setup;

    @FindBy(xpath="//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    private WebElement locations;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup": return this.setup;
            case "schoolSetup": return this.schoolSetup;
            case "locations": return this.locations;
        }
        return null;
    }
}
