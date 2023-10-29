package Bushra.StepDefinitions;

import Bushra.Pages.DialogContentBushra;
import Bushra.Pages.LeftNavBushra;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        dc.mySendKeys(dc.getWebElement("dcNameInput"),"Manager");
        dc.myClick(dc.getWebElement("dcSaveButton"));

    }

    @Then("Added Position Successfully")
    public void addedPositionSuccessfully() {
       // dc.verifyContainsText(dc.getWebElement("scSuccessMessage"),"success");

    }

    @When("Edit Positions")
    public void editPositions() {
        dc.myClick(dc.getWebElement("dcEditButton"));
        dc.getWebElement("dcNameInput").clear();
        dc.mySendKeys(dc.getWebElement("dcNameInput"), "Director");
        dc.myClick(dc.getWebElement("dcEditSaveButton"));

    }

    @Then("Edited Positions Successfully")
    public void editedPositionsSuccessfully() {
        dc.verifyContainsText(dc.getWebElement("scSuccessMessage"),"success");

    }

    @When("Delete to Position")
    public void deleteToPosition() {
        dc.mySendKeys(dc.getWebElement("dcSearchBox"), "Director");
        dc.myClick(dc.getWebElement("dcSearchButton"));
        dc.myClick(dc.getWebElement("dcDeleteImageBtn"));
        dc.myClick(dc.getWebElement("dcDeleteDialogBtn"));

    }

    @Then("Deleted to Positions Succesfully")
    public void deletedToPositionsSuccesfully() {
        dc.verifyContainsText(dc.getWebElement("dcDeleteSuccessMessage"),"success");


    }


    @And("Position do Active or Deactive")
    public void positionDoActiveOrDeactive() {
        dc.myClick(dc.getWebElement("dcActiveButton"));

    }
}
