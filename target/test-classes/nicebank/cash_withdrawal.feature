
Feature: cash withdrawal

  Scenario: successful withdrawal from account in credit
    Given I have deposited $100.00 in my account
    When I withdraw $20.00
    Then $20.00 should be dispensed
    And the balance of my account should be $80.00