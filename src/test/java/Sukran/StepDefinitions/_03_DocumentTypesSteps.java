package Sukran.StepDefinitions;

import Pages.Parent;
import Sukran.Pages.DialogContent;
import Sukran.Pages.LeftNav;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _03_DocumentTypesSteps{
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @Given("Navigate to Document Types")
    public void navigateToDocumentTypes() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.documentTypes);
    }

    @When("Create a Document Types name as {string}")
    public void createADocumentTypesNameAs(String name) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, "Document1");
    }

    @And("click on the Student Registration")
    public void clickOnTheStudentRegistration() {
        dc.myClick(dc.stageInput);
        dc.myClick(dc.studentRegistration);
        new Actions(Driver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        dc.myClick(dc.saveButton);
    }

    @Then("Document should be successfully")
    public void documentShouldBeSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @When("Document corrected name as {string} and click on the Examination")
    public void documentCorrectedNameAsAndClickOnTheExamination(String name) {
        dc.myClick(dc.editButton);
        dc.nameInput.clear();
        dc.mySendKeys(dc.nameInput, "Document2");
        dc.myClick(dc.stageInput);
        dc.myClick(dc.studentRegistration);
        dc.myClick(dc.examination);
        new Actions(Driver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        dc.myClick(dc.saveButton);
    }

    @Then("Document should be successfully updated")
    public void documentShouldBeSuccessfullyUpdated() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @When("Document delete the {string}")
    public void documentDeleteThe(String arg0) {
        dc.myClick(dc.deleteBtn);
        dc.myClick(dc.delete);
    }
    @Then("Document should be successfully deleted")
    public void documentShouldBeSuccessfullyDeleted() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
