package Sena.Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class DialogContentSena extends ParentSena{

    public DialogContentSena() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;
    public WebElement addButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement codeInput;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;
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





    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "addButton": return this.addButton;
            case "saveButton": return this.saveButton;
            case "nameInput": return this.nameInput;
            case "codeInput": return this.codeInput;
            case "searchInput": return this.searchInput;
            case "searchButton": return this.searchButton;
            case "nameList": return this.nameList;
            case "editBtn": return this.editBtn;
            case "successMessage": return this.successMessage;


        }

        return null;
    }


    public void deleteItem(String searchText){
        mySendKeys(searchInput, searchText);
        myClick(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);

    }



}

