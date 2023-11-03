package Bushra.Pages;

import Pages.Parent;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavBushra extends Parent {
    public LeftNavBushra () { PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement lnSetup;
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement lnHumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement lnHumanSetup;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement  lnPosition;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "lnSetup": return this.lnSetup;
            case "lnHumanResources": return this.lnHumanResources;
            case "lnHumanSetup": return this.lnHumanSetup;
            case "lnPosition": return this.lnPosition;
        }
        return null;
    }

}
