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
    @FindBy(xpath = "(//ms-text-field/input)[1]")
    private WebElement inputSearch;
    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement btnSearch;
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
    public WebElement successMessage1;
    @FindBy(xpath="//ms-edit-button/button")
    public WebElement editButton;
    @FindBy(xpath="(//ms-text-field)[2]")
    public WebElement editName;
    @FindBy(xpath="(//mat-option/span)[2]")
    public WebElement examination;
    @FindBy(xpath="//ms-delete-button/button")
    public WebElement deleteBtn;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement delete;
    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]")
    public WebElement addButton2;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput2;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement codeInput;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton2;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage2;
    @FindBy(css="[placeholder*='NAME'] input")
    public WebElement searchInput;
    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;
    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;
    @FindBy(xpath = "//tbody[@role='rowgroup']//tr//td[2]")
    public WebElement nameList;
    @FindBy(xpath = "//ms-edit-button/button")
    public WebElement editBtn;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement addButton3;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput3;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortNameInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    public WebElement capacity;

    @FindBy(xpath="//ms-save-button/button")
    private WebElement saveButton3;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    private WebElement successMessage3;

    @FindBy(xpath="(//ms-edit-button[@class='ng-star-inserted']//button)[1]")
    private WebElement editButton3;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    private WebElement deleteImageBtn3;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement deleteDialogBtn3;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    private WebElement deleteSuccessMessage;

    @FindBy(xpath = "(//div[@class='mdc-form-field']//button)[1]")
    private WebElement activeButton;

    @FindBy (css = "[class='nav-link-title ng-tns-c2089661534-6 ng-star-inserted']")
    public WebElement setup4;
    @FindBy (css = "[class='ng-tns-c2089661534-7 ng-tns-c2089661534-6 nav-collapsable nav-item ng-star-inserted']")
    public WebElement parameters4;
    @FindBy(css = "div > fuse-nav-vertical-item:nth-child(11) > a > span")
    public  WebElement bankAccounts4;
    @FindBy(css = "ms-add-button > div > button > span.mat-mdc-button-touch-target")
    public WebElement create4;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/bank-account-dialog/ms-dialog/ms-dialog-content/div/mat-form-field[1]/div/div[1]/div/ms-text-field/input")
    public  WebElement name4;
    @FindBy(css = "[data-placeholder=\"IBAN\"]")
    public WebElement iban4;
    @FindBy(xpath = "(//span[text()='Currency'])[3]")
    public WebElement currency4;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span")
    public  WebElement currencyEUR4;
    @FindBy (css = "[data-placeholder='Integration Code']")
    public WebElement code4;
    @FindBy (css = "ms-save-button > button > span.mdc-button__label > fa-icon > svg")
    public WebElement save4;

    @FindBy(xpath = "//*[@class='mdc-data-table__content']/tr[1]")
    public WebElement update4;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div/bank-account-dialog/ms-dialog/ms-dialog-content/div/mat-slide-toggle/div/label")
    public WebElement inActive4;
    @FindBy(xpath = "//*[@id=\"cdk-drop-list-0\"]/tbody/tr[1]/td[7]/div[1]/ms-delete-button/button/span[3]")
    public WebElement delete4;
    @FindBy(css = "[class='mdc-button mat-mdc-button mdc-button--raised mat-mdc-raised-button mat-accent mat-mdc-button-base']>[class='mdc-button__label']")
    public WebElement deleteEnd4;

    public WebElement getWebElement(String element) {
        switch (element) {
            case "username": return this.username;
            case "password": return this.password;
            case "loginButton": return this.loginButton;
            case "txtTechnoStudy": return this.txtTechnoStudy;
            case "setup": return this.setup;
            case "parameters": return this.parameters;
            case "Fields": return this.Fields;
            case "btnAdd": return this.btnAdd;
            case "inputName": return this.inputName;
            case "inputCode": return this.inputCode;
            case "btnSave": return this.btnSave;
            case "successMessage": return this.successMessage;
            case "btnDelet": return this.btnDelete;
            case "confirmDelete ": return this.confirmDelete;
            case "inputSearch": return this.inputSearch;
            case "btnSearch": return this.btnSearch;
            case"successDelete":return this.successDelete;
            case "addButton2": return this.addButton2;
            case "saveButton2": return this.saveButton2;
            case "nameInput2": return this.nameInput2;
            case "codeInput": return this.codeInput;
            case "searchInput": return this.searchInput;
            case "searchButton": return this.searchButton;
            case "nameList": return this.nameList;
            case "editBtn": return this.editBtn;
            case "successMessage2": return this.successMessage2;
            case "addButton3": return this.addButton3;
            case "nameInput3": return this.nameInput3;
            case "shortNameInput": return this.shortNameInput;
            case "capacity": return this.capacity;
            case "saveButton3": return this.saveButton3;
            case "successMessage3": return this.successMessage3;
            case "editButton3": return this.editButton3;
            case "deleteImageBtn3": return this.deleteImageBtn3;
            case "deleteDialogBtn3": return this.deleteDialogBtn3;
            case "deleteSuccessMessage": return this.deleteSuccessMessage;
            case "activeButton": return this.activeButton;

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
