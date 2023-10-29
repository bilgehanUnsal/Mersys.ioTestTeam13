package Bushra.StepDefinitions;

import Bushra.Pages.DialogContentBushra;
import Bushra.Pages.LeftNavBushra;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _05_Positions {

    LeftNavBushra ln = new LeftNavBushra();
    DialogContentBushra dc = new DialogContentBushra();

    @Given("Navigate to HR Positions")
    public void navigateToHRPositions() {
        ln.myClick(ln.getWebElement("lnSetup"));
        ln.myClick(ln.getWebElement("lnHumanResources"));
        ln.myClick(ln.getWebElement("lnHumanSetup"));
        ln.myClick(ln.getWebElement("lnPosition"));

    }

    @When("Add to Positions")
    public void addToPositions() {
        dc.myClick(dc.getWebElement("dcAddButton"));
        dc.mySendKeys(dc.getWebElement("dcShortNameInput"),"Manager");
        dc.myClick(dc.getWebElement("dcAddButton"));
        dc.myClick(dc.getWebElement("dcAddButton"));


    }

    @Then("Added Position Successfully")
    public void addedPositionSuccessfully() {

    }

    @When("Edit Positions")
    public void editPositions() {

    }

    @Then("Edited Positions Successfully")
    public void editedPositionsSuccessfully() {

    }

    @When("Delete to Position")
    public void deleteToPosition() {

    }

    @Then("Deleted to Positions Succesfully")
    public void deletedToPositionsSuccesfully() {
    }


    @And("Position do Active or Deactive")
    public void positionDoActiveOrDeactive() {

    }
}
