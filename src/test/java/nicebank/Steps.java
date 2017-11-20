package nicebank;

import Transforms.MoneyConverter;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by juan.hernandez on 11/17/17.
 */
public class Steps {

    private Account myAccount;

    class Teller {
        public void withdrawFrom(Account account, int dollars) {
        }
    }

    class Account {
        private Money balance = new Money(0, 0);

        public void deposit(Money amount) {
            balance = balance.add(amount);
        }

        public Money getBalance() {
            return balance;
        }
    }

    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void i_have_deposited_$_in_my_account(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        myAccount = new Account();
        myAccount.deposit(amount);

        Assert.assertEquals("Incorrect balance -",
                amount, myAccount.getBalance());
    }


    @When("^I withdraw \\$(\\d+)$")
    public void i_withdraw_$(int amount) throws Throwable {
        Teller teller = new Teller();
        teller.withdrawFrom(myAccount, amount);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
