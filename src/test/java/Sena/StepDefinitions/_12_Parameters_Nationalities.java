
package Sena.StepDefinitions;



import Sena.Pages.DialogContentSena;
import Sena.Pages.LeftNavSena;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import java.util.List;

public class _12_Parameters_Nationalities {
    LeftNavSena ln = new LeftNavSena();
    DialogContentSena dc = new DialogContentSena();

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {
        List<String> strlinkList = linkler.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strlinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.myClick(linkWebElement);
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);
            dc.mySendKeys(e, yazi);
        }
    }




    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @Then("Name should display successfully")
    public void nameShouldDisplaySuccessfully(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);
            dc.verifyContainsText(e, yazi);
        }

    }

    @And("User delete the element from Dialog")
    public void userDeleteTheElementFromDialog(DataTable dt) {
        List<String> silinecekler = dt.asList(String.class);

        for (int i = 0; i < silinecekler.size(); i++) {
            dc.deleteItem(silinecekler.get(i));
        }
    }


    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        dc.verifyContainsText(dc.txtTechnoStudy,"Techno Study");

    }


}


