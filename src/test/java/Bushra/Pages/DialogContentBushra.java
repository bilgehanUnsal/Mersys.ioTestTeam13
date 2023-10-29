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

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement dcNameInput;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement dcSaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement dcSuccessMessage;


    @FindBy(xpath = "(//ms-edit-button[@class='ng-star-inserted']//button)[1]")
    private WebElement dcEditButton;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement dcEditSaveButton;

    @FindBy(css = "[data-placeholder='Name']")
    private WebElement dcSearchBox;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement dcSearchButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement dcDeleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement dcDeleteDialogBtn;

    @FindBy(xpath = "//div[contains(text(),'Location successfully deleted')]")
    private WebElement dcDeleteSuccessMessage;

    @FindBy(xpath = "(//tbody[@role='rowgroup']/tr/td)[2]")
    public WebElement dcPositionNameCont;
    @FindBy(xpath = "(//div[@class='mdc-form-field']//button)[1]")
    private WebElement dcActiveButton;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "dcAddButton": return this.dcAddButton;
            case "dcNameInput": return this.dcNameInput;
            case "dcSaveButton": return this.dcSaveButton;
            case "dcSuccessMessage": return this.dcSuccessMessage;
            case "dcEditButton": return this.dcEditButton;
            case "dcEditSaveButton": return this.dcEditSaveButton;
            case "dcSearchBox": return this.dcSearchBox;
            case "searchButton": return this.dcSearchButton;
            case "dcDeleteImageBtn": return this.dcDeleteImageBtn;
            case "dcDeleteDialogBtn": return this.dcDeleteDialogBtn;
            case "dcDeleteSuccessMessage": return this.dcDeleteSuccessMessage;
            case "dcPositionNameCont": return this.dcPositionNameCont;
            case "dcActiveButton": return this.dcActiveButton;

        }
        return null;
    }
}
