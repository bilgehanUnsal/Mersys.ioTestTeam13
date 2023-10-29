package Tamella.StepDefinitions;

import Tamella.Pakes.DialogContentTamella;
import Tamella.Pakes.LeftNavTamella;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _06_SubjectCategories {
    LeftNavTamella lnt = new LeftNavTamella();
    DialogContentTamella dct=new DialogContentTamella();
    @When("Navigate to Location setup")
    public void navigateToLocationSetup() {
        lnt.myClick(lnt.getWebElement("educationbutton"));
        lnt.myClick(lnt.getWebElement("educationsetup"));
        lnt.myClick(lnt.getWebElement("subjectcategories"));
    }

    @When("Add education location")
    public void addEducationLocation() {
        dct.myClick(dct.getWebElement("scAddButton"));
        dct.mySendKeys(dct.getWebElement("scName"),"test");
        dct.mySendKeys(dct.getWebElement("scCode"),"123");
        dct.myClick(dct.getWebElement("scSaveButton"));
    }

    @Then("Added education successfully")
    public void addedEducationSuccessfully() {
        dct.verifyContainsText(dct.getWebElement("scSuccessMessage"),"succesfully");
    }

    @When("Edit education location")
    public void editEducationLocation() {
        dct.myClick(dct.getWebElement("scEdit"));
        dct.getWebElement("scName").clear();
        dct.mySendKeys(dct.getWebElement("scName"), "city");
        dct.getWebElement("scCode").clear();
        dct.mySendKeys(dct.getWebElement("scCode"), "9876");
        dct.myClick(dct.getWebElement("scSaveButton"));
    }
    @Then("Edited educatoin successfully")
    public void editedEducatoinSuccessfully() {
        dct.verifyContainsText(dct.getWebElement("scSuccessMessage"),"successfully");
    }

    @When("Delete education locaation")
    public void deleteEducationLocaation() {
        dct.myClick(dct.getWebElement("scDelete"));
        dct.myClick(dct.getWebElement("scDeleteButton"));
    }

    @Then("Deleted education successfully")
    public void deletedEducationSuccessfully() {
        dct.verifyContainsText(dct.getWebElement("scDeleteMessage"),"successfully");
    }

    @And("Education Location")
    public void educationLocation() {
        dct.mySendKeys(dct.getWebElement("scSearchName"),"city");
        dct.mySendKeys(dct.getWebElement("scSearchCode"),"123");
        dct.myClick(dct.getWebElement("scSearchButton"));
    }
}
