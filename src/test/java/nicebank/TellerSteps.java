/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
 ***/
package nicebank;

import Transforms.MoneyConverter;
import cucumber.api.Transform;
import cucumber.api.java.en.*;

import support.KnowsTheDomain;

public class TellerSteps {

    KnowsTheDomain helper;

    public TellerSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @When("^I withdraw (\\$\\d+\\.\\d+)$")
    public void iWithdraw$(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getAutomatedTeller().witdrawFrom(helper.getMyAccount(), amount);
    }
}