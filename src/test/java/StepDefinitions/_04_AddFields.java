package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_AddFields {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Click On The element")
    public void clickOnTheElement(DataTable value) {
        List<String> listElement = value.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            WebElement webElement = dc.getWebElement(listElement.get(i));
            dc.myClick(webElement);
        }
    }

    @And("Enter Data in Text box")
    public void enterDataInTextBox(DataTable value) {
        List<List<String>> lists = value.asLists(String.class);
        for (int i = 0; i < lists.size(); i++) {
            WebElement webElement = dc.getWebElement(lists.get(i).get(0));
            String str = lists.get(i).get(1);
            dc.mySendKeys(webElement, str);
        }
    }

    @Then("User should Field successfully created")
    public void userShouldFieldSuccessfullyCreated() {
        dc.verifyContainsText(dc.getWebElement("successMessage"), "Field successfully created");
    }

    @When("Enter the {string}")
    public void enterThe(String arg0) {
        dc.deleteItem(arg0);
    }

    @Then("User should Field successfully deleted")
    public void userShouldFieldSuccessfullyDeleted() {
        dc.verifyContainsText(dc.getWebElement("successDelete"), "Field successfully deleted");
    }
}
