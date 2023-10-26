package Bilgehan.StepDefinitions;

import Bilgehan.Pages.DialogContentBilge;
import Bilgehan.Pages.LeftNavBilge;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class _07_SchoolSetup {
    DialogContentBilge dcb = new DialogContentBilge();
    LeftNavBilge lnb = new LeftNavBilge();
    @When("Add school location")
    public void addSchoolLocation() {
        dcb.myClick(dcb.getWebElement("addButton"));
        dcb.mySendKeys(dcb.getWebElement("nameInput"), "Zanzibar");
        dcb.mySendKeys(dcb.getWebElement("shortNameInput"), "ZR01");
        dcb.getWebElement("capacity").sendKeys(Keys.DELETE);
        dcb.mySendKeys(dcb.getWebElement("capacity"), "15");
        dcb.myClick(dcb.getWebElement("shortNameInput"));
        dcb.myClick(dcb.getWebElement("saveButton"));
    }

    @Then("Added school successfully")
    public void addedSchoolSuccessfully() {
        dcb.verifyContainsText(dcb.getWebElement("successMessage"), "successfully");
    }

    @When("Edit school location")
    public void editSchoolLocation() {
        dcb.myClick(dcb.getWebElement("editButton"));
        dcb.getWebElement("nameInput").clear();
        dcb.mySendKeys(dcb.getWebElement("nameInput"), "Bangkok");
        dcb.getWebElement("shortNameInput").clear();
        dcb.mySendKeys(dcb.getWebElement("shortNameInput"), "BKK");
        dcb.getWebElement("capacity").clear();
        dcb.mySendKeys(dcb.getWebElement("capacity"), "25");
        dcb.myClick(dcb.getWebElement("shortNameInput"));
        dcb.myClick(dcb.getWebElement("saveButton"));
    }

    @Then("Edited school successfully")
    public void editedSchoolSuccessfully() {
        dcb.verifyContainsText(dcb.getWebElement("successMessage"), "successfully");
    }

    @When("Delete school location")
    public void deleteSchoolLocation() {
        dcb.myClick(dcb.getWebElement("deleteImageBtn"));
        dcb.myClick(dcb.getWebElement("deleteDialogBtn"));
    }

    @Then("Deleted school successfully")
    public void deletedSchoolSuccessfully() {
        dcb.verifyContainsText(dcb.getWebElement("deleteSuccessMessage"), "successfully");
    }

    @And("School location do active and deactive")
    public void schoolLocationDoActiveAndDeactive() {
        dcb.myClick(dcb.getWebElement("activeButton"));
    }

    @When("Navigate to location setup")
    public void navigateToLocationSetup() {
        lnb.myClick(lnb.getWebElement("setup"));
        lnb.myClick(lnb.getWebElement("schoolSetup"));
        lnb.myClick(lnb.getWebElement("locations"));
    }
}
