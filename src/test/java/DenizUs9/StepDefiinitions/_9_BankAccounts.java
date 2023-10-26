package DenizUs9.StepDefiinitions;

import DenizUs9.Pages.Dialog;
import Pages.DialogContent;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class _9_BankAccounts {
    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    Dialog d = new Dialog();
    public WebDriverWait bekle = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @Then("Click setup")
    public void clickSetup() {
        d.myClick(d.setup);
    }

    @Then("Click parameters")
    public void clickParameters() {
        bekle.until(ExpectedConditions.elementToBeClickable(d.parameters));
        d.parameters.click();

    }



    @And("Click bank accounts")
    public void clickBankAccounts() {
        d.myClick(d.bankAccounts);
    }

    @Then("Add new account")
    public void addNewAccount() {
        d.myClick(d.create);
        d.myClick(d.name);
        d.name.sendKeys("Bahattin");
        d.mySendKeys(d.iban,"1234");
        d.myClick(d.currency);
        bekle.until(ExpectedConditions.elementToBeClickable(d.currencyEUR));
        d.myClick(d.currencyEUR);

        d.code.sendKeys("1234");
        bekle.until(ExpectedConditions.elementToBeClickable(d.save));
        d.myClick(d.save);
    }

    @Then("Account update")
    public void accountUpdate() {
        waitForSeconds(2);
        Driver.getDriver().navigate().refresh();
        d.myClick(d.update);
        waitForSeconds(1);
        d.iban.clear();
        d.mySendKeys(d.iban,"9898");
        d.myClick(d.save);


    }

    @Then("Account will be inactive")
    public void accountWillBeInactive() {
        waitForSeconds(2);
        d.myClick(d.update);
        d.myClick(d.inActive);
        d.myClick(d.save);
    }



    @Then("User should successfully delete account")
    public void userShouldSuccessfullyDeleteAccount() {
        waitForSeconds(2);
        d.myClick(d.delete);
        d.myClick(d.deleteEnd);
    }
}
