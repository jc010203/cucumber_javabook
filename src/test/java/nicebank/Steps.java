package nicebank;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by juan.hernandez on 11/17/17.
 */
public class Steps {

    class Account {
        private Money balance = new Money(0, 0);

        public void deposit(Money amount) {
            balance = balance.add(amount);
        }

        public Money getBalance() {
            return balance;
        }
    }

    @Given("^I have deposited \\$\"(.*?)\" in my account$")
    public void i_have_deposited_$_in_my_account(Money amount) throws Throwable {
        Account myAccount = new Account();
        myAccount.deposit(amount);

        Assert.assertEquals("Incorrect balance -",
                amount, myAccount.getBalance());
    }


    @When("^I withdraw \\$(\\d+)$")
    public void i_withdraw_$(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
