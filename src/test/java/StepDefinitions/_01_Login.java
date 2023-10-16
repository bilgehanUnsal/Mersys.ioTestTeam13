package StepDefinitions;

import Pages.DialogContent;
import Utilities.Driver;
import Utilities.Excelutility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.ArrayList;
import java.util.List;

public class _01_Login {
    DialogContent dc = new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        Driver.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password click login button with ApachePOI")
    public void enterUsernameAndPasswordClickLoginButtonWithApachePOI(DataTable dt) {
        List<String> stringList = dt.asList(String.class);
        ArrayList<ArrayList<String>> tablo = Excelutility.getData
                ("src/test/java/StepDefinitions/TestMersys.io.xlsx", "Sheet1", 2);

        for (ArrayList<String> satir : tablo){
            dc.mySendKeys(dc.getWebElement(stringList.get(0)), satir.get(0));
            dc.mySendKeys(dc.getWebElement(stringList.get(1)), satir.get(1));
        }

        dc.myClick(dc.getWebElement(stringList.get(2)));
    }

    @Then("User should successfully")
    public void userShouldSuccessfully() {
        dc.verifyContainsText(dc.getWebElement("txtTechnoStudy"), "Techno Study");
    }
}
