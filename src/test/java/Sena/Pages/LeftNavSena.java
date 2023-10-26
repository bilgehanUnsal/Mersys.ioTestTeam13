package Sena.Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class LeftNavSena extends ParentSena{

    public LeftNavSena() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenShip;






    public WebElement getWebElement(String strElement){
        switch (strElement) {
            case "setup":
                return this.setup;
            case "parameters":
                return this.parameters;
            case "countries":
                return this.countries;
            case "citizenShip":
                return this.citizenShip;

        }

        return null;
    }


}
