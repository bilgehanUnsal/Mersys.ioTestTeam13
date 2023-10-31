package Sukran.Pages;

import Pages.Parent;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() { PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath="//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath="(//span[text()='Document Types'])[1]")
    public WebElement documentTypes;
}
