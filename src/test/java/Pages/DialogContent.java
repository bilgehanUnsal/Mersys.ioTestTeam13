package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(css="input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    public WebElement getWebElement(String element){
        switch (element){
            case "username" : return this.username;
            case "password" : return this.password;
            case "loginButton" : return this.loginButton;
            case "txtTechnoStudy" : return this.txtTechnoStudy;
        }
        return null;
    }
}
