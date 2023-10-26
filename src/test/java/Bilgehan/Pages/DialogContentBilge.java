package Bilgehan.Pages;

import Pages.Parent;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentBilge extends Parent {
    public DialogContentBilge() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortNameInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    public WebElement capacity;

    @FindBy(xpath="//ms-save-button/button")
    private WebElement saveButton;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath="(//ms-edit-button[@class='ng-star-inserted']//button)[1]")
    private WebElement editButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    private WebElement deleteImageBtn;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement deleteDialogBtn;

    @FindBy(xpath="//div[contains(text(),'Location successfully deleted')]")
    private WebElement deleteSuccessMessage;

    @FindBy(xpath = "(//div[@class='mdc-form-field']//button)[1]")
    private WebElement activeButton;


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "addButton": return this.addButton;
            case "nameInput": return this.nameInput;
            case "shortNameInput": return this.shortNameInput;
            case "capacity": return this.capacity;
            case "saveButton": return this.saveButton;
            case "successMessage": return this.successMessage;
            case "editButton": return this.editButton;
            case "deleteImageBtn": return this.deleteImageBtn;
            case "deleteDialogBtn": return this.deleteDialogBtn;
            case "deleteSuccessMessage": return this.deleteSuccessMessage;
            case "activeButton": return this.activeButton;
        }

        return null;
    }
}
