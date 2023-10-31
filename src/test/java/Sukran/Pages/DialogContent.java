package Sukran.Pages;

import Pages.Parent;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(Driver.getDriver(), this); }
    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]")
    public WebElement addButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;
    @FindBy(xpath="(//mat-select/div)[3]")
    public WebElement stageInput;
    @FindBy(xpath="(//mat-option/span)[1]")
    public WebElement studentRegistration;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath="(//ms-edit-button)[3]")
    public WebElement editButton;
    @FindBy(xpath="(//ms-text-field)[2]")
    public WebElement editName;
    @FindBy(xpath="(//mat-option/span)[2]")
    public WebElement examination;
    @FindBy(xpath="(//ms-delete-button)[2]")
    public WebElement deleteBtn;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement delete;

}
