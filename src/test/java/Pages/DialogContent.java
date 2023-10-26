package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;
    @FindBy(xpath = "( //span[contains(text(),'Setup')])[1]")
    public WebElement setup;
    @FindBy(xpath = "( //span[contains(text(),'Parameters')])[1]")
    private WebElement parameters;
    @FindBy(xpath = "( //span[contains(text(),'Fields')])[1]")
    private WebElement Fields;
    @FindBy(xpath = "//ms-add-button[@tooltip='GENERAL.BUTTON.ADD']")
    private WebElement btnAdd;
    @FindBy(xpath = "(//ms-dialog-content//input)[1]")
    private WebElement inputName;
    @FindBy(xpath = "(//ms-dialog-content//input)[2]")
    private WebElement inputCode;
    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement btnSave;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement btnDelete;
    @FindBy(css = "button[type='submit']")
    private WebElement confirmDelete;
    @FindBy(xpath = "//div[contains(text(),'Field successfully deleted')]")
    private WebElement successDelete;
    @FindBy(xpath = "(//div//input)[1]")
    private WebElement inputSearch;
    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement btnSearch;

    public WebElement getWebElement(String element) {
        switch (element) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "loginButton":
                return this.loginButton;
            case "txtTechnoStudy":
                return this.txtTechnoStudy;
            case "setup":
                return this.setup;
            case "parameters":
                return this.parameters;
            case "Fields":
                return this.Fields;
            case "btnAdd":
                return this.btnAdd;
            case "inputName":
                return this.inputName;
            case "inputCode":
                return this.inputCode;
            case "btnSave":
                return this.btnSave;
            case "successMessage":
                return this.successMessage;
            case "btnDelet":
                return this.btnDelete;
            case "confirmDelete ":
                return this.confirmDelete;
            case "inputSearch":
                return this.inputSearch;
            case "btnSearch":
                return this.btnSearch;
            case"successDelete":return this.successDelete;
        }
        return null;
    }
    public void deleteItem(String text){
        mySendKeys(inputSearch,text);
        myClick(btnSearch);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));
        myClick(btnDelete);
        myClick(confirmDelete);
    }
}
