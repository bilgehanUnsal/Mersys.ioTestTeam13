package StepDefinitions;

import Pages.DialogContent;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class _09_BankAccounts {
    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    DialogContent dc = new DialogContent();
    public WebDriverWait bekle = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @Then("Click setup")
    public void clickSetup() {
        dc.myClick(dc.setup4);
    }

    @Then("Click parameters")
    public void clickParameters() {
        bekle.until(ExpectedConditions.elementToBeClickable(dc.parameters4));
        dc.parameters4.click();

    }



    @And("Click bank accounts")
    public void clickBankAccounts() {
        dc.myClick(dc.bankAccounts4);
    }

    @Then("Add new account")
    public void addNewAccount() {
        dc.myClick(dc.create4);
        dc.myClick(dc.name4);
        dc.name4.sendKeys("Bahattin");
        dc.mySendKeys(dc.iban4,"1234");
        dc.myClick(dc.currency4);
        bekle.until(ExpectedConditions.elementToBeClickable(dc.currencyEUR4));
        dc.myClick(dc.currencyEUR4);

        dc.code4.sendKeys("1234");
        bekle.until(ExpectedConditions.elementToBeClickable(dc.save4));
        dc.myClick(dc.save4);
    }

    @Then("Account update")
    public void accountUpdate() {
        waitForSeconds(2);
        Driver.getDriver().navigate().refresh();
        dc.myClick(dc.update4);
        waitForSeconds(1);
        dc.iban4.clear();
        dc.mySendKeys(dc.iban4,"9898");
        dc.myClick(dc.save4);


    }

    @Then("Account will be inactive")
    public void accountWillBeInactive() {
        waitForSeconds(2);
        dc.myClick(dc.update4);
        dc.myClick(dc.inActive4);
        dc.myClick(dc.save4);
    }



    @Then("User should successfully delete account")
    public void userShouldSuccessfullyDeleteAccount() {
        waitForSeconds(2);
        dc.myClick(dc.delete4);
        dc.myClick(dc.deleteEnd4);
    }
}
