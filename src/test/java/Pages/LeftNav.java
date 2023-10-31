package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() { PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath="//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath="(//span[text()='Document Types'])[1]")
    public WebElement documentTypes;
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup2;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters2;
    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;
    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setup3;

    @FindBy(xpath="//span[text()='School Setup']")
    private WebElement schoolSetup3;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    private WebElement locations3;

    public WebElement getWebElement(String strElement){
        switch (strElement) {
            case "setup2": return this.setup2;
            case "parameters2": return this.parameters2;
            case "countries": return this.countries;
            case "nationalities": return this.nationalities;
            case "setup3": return this.setup3;
            case "schoolSetup3": return this.schoolSetup3;
            case "locations3": return this.locations3;
        }

        return null;
    }
}
