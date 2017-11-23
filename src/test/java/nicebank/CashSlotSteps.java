/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
 ***/
package nicebank;

import cucumber.api.Transform;
import cucumber.api.java.en.*;

import org.junit.*;

import support.KnowsTheDomain;

import Transforms.MoneyConverter;

public class CashSlotSteps {

    KnowsTheDomain helper;

    public CashSlotSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Given("^(\\$\\d+\\.\\d+) should be dispensed$")
    public void $ShouldBeDispensed(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getCashSlot().dispense(amount);
        Assert.assertEquals("Incorrect amount dispensed -", amount,
                helper.getCashSlot().getContents());
    }
}