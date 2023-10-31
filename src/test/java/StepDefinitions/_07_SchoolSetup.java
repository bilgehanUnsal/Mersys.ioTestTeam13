package StepDefinitions;

import Bilgehan.Pages.DialogContentBilge;
import Bilgehan.Pages.LeftNavBilge;
import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class _07_SchoolSetup {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @When("Add school location")
    public void addSchoolLocation() {
        dc.myClick(dc.getWebElement("addButton3"));
        dc.mySendKeys(dc.getWebElement("nameInput3"), "Zanzibar");
        dc.mySendKeys(dc.getWebElement("shortNameInput"), "ZR01");
        dc.getWebElement("capacity").sendKeys(Keys.DELETE);
        dc.mySendKeys(dc.getWebElement("capacity"), "15");
        dc.myClick(dc.getWebElement("shortNameInput"));
        dc.myClick(dc.getWebElement("saveButton3"));
    }

    @Then("Added school successfully")
    public void addedSchoolSuccessfully() {
        dc.verifyContainsText(dc.getWebElement("successMessage3"), "successfully");
    }

    @When("Edit school location")
    public void editSchoolLocation() {
        dc.myClick(dc.getWebElement("editButton3"));
        dc.getWebElement("nameInput3").clear();
        dc.mySendKeys(dc.getWebElement("nameInput3"), "Bangkok");
        dc.getWebElement("shortNameInput").clear();
        dc.mySendKeys(dc.getWebElement("shortNameInput"), "BKK");
        dc.getWebElement("capacity").clear();
        dc.mySendKeys(dc.getWebElement("capacity"), "25");
        dc.myClick(dc.getWebElement("shortNameInput"));
        dc.myClick(dc.getWebElement("saveButton3"));
    }

    @Then("Edited school successfully")
    public void editedSchoolSuccessfully() {
        dc.verifyContainsText(dc.getWebElement("successMessage3"), "successfully");
    }

    @When("Delete school location")
    public void deleteSchoolLocation() {
        dc.myClick(dc.getWebElement("deleteImageBtn3"));
        dc.myClick(dc.getWebElement("deleteDialogBtn3"));
    }

    @Then("Deleted school successfully")
    public void deletedSchoolSuccessfully() {
        dc.verifyContainsText(dc.getWebElement("deleteSuccessMessage"), "successfully");
    }

    @And("School location do active and deactive")
    public void schoolLocationDoActiveAndDeactive() {
        dc.myClick(dc.getWebElement("activeButton"));
    }

    @When("Navigate to location setup")
    public void navigateToLocationSetup() {
        ln.myClick(ln.getWebElement("setup3"));
        ln.myClick(ln.getWebElement("schoolSetup3"));
        ln.myClick(ln.getWebElement("locations3"));
    }
}
