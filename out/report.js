$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nicebank/cash_withdrawal.feature");
formatter.feature({
  "line": 2,
  "name": "cash withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 484420211,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "successful withdrawal from account in credit",
  "description": "",
  "id": "cash-withdrawal;successful-withdrawal-from-account-in-credit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have deposited $100.00 in my account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I withdraw $20.00",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "$20.00 should be dispensed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the balance of my account should be $80.00",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "$100.00",
      "offset": 17
    }
  ],
  "location": "AccountSteps.iHaveDeposited$InMyAccount(Money)"
});
formatter.result({
  "duration": 111646552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$20.00",
      "offset": 11
    }
  ],
  "location": "TellerSteps.iWithdraw$(Money)"
});
formatter.result({
  "duration": 4286161585,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$20.00",
      "offset": 0
    }
  ],
  "location": "CashSlotSteps.$ShouldBeDispensed(Money)"
});
formatter.result({
  "duration": 2715085,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$80.00",
      "offset": 36
    }
  ],
  "location": "AccountSteps.theBalanceOfMyAccountShouldBe$(Money)"
});
formatter.result({
  "duration": 670952,
  "error_message": "java.lang.AssertionError: Incorrect account balance - expected:\u003cnicebank.Money@41c07648\u003e but was:\u003cnicebank.Money@1fe8d51b\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat nicebank.AccountSteps.theBalanceOfMyAccountShouldBe$(AccountSteps.java:36)\n\tat ✽.And the balance of my account should be $80.00(nicebank/cash_withdrawal.feature:8)\n",
  "status": "failed"
});
formatter.after({
  "duration": 91550813,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2745560928,
  "status": "passed"
});
});