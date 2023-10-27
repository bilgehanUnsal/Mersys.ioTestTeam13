package Tamella.Pakes;

import Pages.Parent;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavTamella extends Parent {
    public LeftNavTamella() { PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(xpath = "(//span[text()='Education'])[1]")
    private WebElement educationbutton;

    @FindBy(xpath ="(//span[text()='Setup'])[5]" )
    private WebElement educationsetup;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectcategories;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "educationbutton": return this.educationbutton;
            case "educationsetup": return this.educationsetup;
            case "subjectcategories": return this.subjectcategories;
        }

        return null;
    }
}
