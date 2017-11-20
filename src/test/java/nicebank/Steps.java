package nicebank;

import Transforms.MoneyConverter;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import support.KnowsTheDomain;

/**
 * Created by juan.hernandez on 11/17/17.
 */
public class Steps {

    KnowsTheDomain helper;

    public Steps() {
        helper = new KnowsTheDomain();
    }


    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void i_have_deposited_$_in_my_account(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals("Incorrect balnace -", amount, helper.getMyAccount().getBalance());
    }


    @When("^I withdraw \\$(\\d+)$")
    public void i_withdraw_$(int amount) throws Throwable {
        helper.getCashSlot().dispense(amount);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed - ", dollars, helper.getCashSlot().getContents());
    }
}
