package Tamella.Pakes;

import Pages.Parent;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentTamella extends Parent {
    public DialogContentTamella() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement scAddButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement scName;

    @FindBy(xpath = "ms-dialog-content input[data-placeholder='Code'] ")
    private WebElement scCode;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement scSaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement scSuccessMessage;

    @FindBy(xpath = "//ms-edit-button\n")
    private WebElement scEdit;

    @FindBy(xpath = "(//ms-delete-button//button)[1]\n")
    private WebElement scDelete;

    @FindBy(xpath = "//button[@type='submit']\n")
    private WebElement scDeleteButton;

    @FindBy(xpath = "//div[contains(text(),'Location successfully deleted')]\n")
    private WebElement scDeleteMessage;

    @FindBy(xpath = "[data-placeholder='Name']")
    private WebElement scSearchName;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]/n")
    private WebElement scSearchCode;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement scSearchButton;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "scAddButton":
                return this.scAddButton;
            case "scName":
                return this.scName;
            case "scCode":
                return this.scCode;
            case "scSaveButton":
                return this.scSaveButton;
            case "scSuccessMessage":
                return this.scSuccessMessage;
            case "scEdit":
                return this.scEdit;
            case "scDelete":
                return this.scDelete;
            case "scDeleteButton":
                return this.scDeleteButton;
            case "scDeleteMessage":
                return this.scDeleteMessage;
            case "scSearchName":
                return this.scSearchName;
            case "scSearchCode":
                return this.scSearchCode;
            case "scSearchButton":
                return this.scSearchButton;

        }

        return null;

    }
}
