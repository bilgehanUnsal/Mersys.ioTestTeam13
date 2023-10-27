package Tamella.StepDefinitions;

import Tamella.Pakes.LeftNavTamella;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _06_SubjectCategories {
    LeftNavTamella lnt = new LeftNavTamella();
    @When("Navigate to Location setup")
    public void navigateToLocationSetup() {
        lnt.myClick(lnt.getWebElement("educationbutton"));
        lnt.myClick(lnt.getWebElement("educationsetup"));
        lnt.myClick(lnt.getWebElement("subjectcategories"));
    }

    @When("Add education location")
    public void addEducationLocation() {
    }

    @Then("Added education successfully")
    public void addedEducationSuccessfully() {
    }

    @When("Edit education location")
    public void editEducationLocation() {
    }

    @Then("Edited educatoin successfully")
    public void editedEducatoinSuccessfully() {
    }

    @When("Delete education locaation")
    public void deleteEducationLocaation() {
    }

    @Then("Deleted education successfully")
    public void deletedEducationSuccessfully() {
    }

    @And("Education Location")
    public void educationLocation() {
    }
}
