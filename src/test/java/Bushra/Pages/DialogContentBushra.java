package Bushra.Pages;

import Pages.Parent;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentBushra extends Parent {

    public DialogContentBushra() { PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement dcAddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement dcShortNameInput;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement dcSaveButton;

    @FindBy(xpath = "(//ms-edit-button[@class='ng-star-inserted']//button)[1]")
    private WebElement dcEditButton;

    @FindBy(css = "[data-placeholder='Name']")
    public WebElement dcSearchBox;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[1]")
    public WebElement dcShortName;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement dcSearchButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement dcDeleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement dcDeleteDialogBtn;

    @FindBy(xpath = "//div[contains(text(),'Location successfully deleted')]")
    private WebElement dcDeleteSuccessMessage;

    @FindBy(xpath = "(//div[@class='mdc-form-field']//button)[1]")
    private WebElement dcActiveButton;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "dcAddButton": return this.dcAddButton;
            case "dcShortNameInput": return this.dcShortNameInput;
            case "dcSaveButton": return this.dcSaveButton;
            case "dcSearchButton": return this.dcSearchButton;
            case "dcShortName": return this.dcShortName;
            case "searchButton": return this.dcSearchButton;
            case "dcDeleteImageBtn": return this.dcDeleteImageBtn;
            case "dcDeleteDialogBtn": return this.dcDeleteDialogBtn;
            case "dcDeleteSuccessMessage": return this.dcDeleteSuccessMessage;
            case "dcActiveButton": return this.dcActiveButton;

        }
        return null;
    }
}
