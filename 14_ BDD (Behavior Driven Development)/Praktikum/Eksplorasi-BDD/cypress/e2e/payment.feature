Feature: List user
    As a user
    I want to see my home page
    So that I can update my profile

  Scenario: As user i have be able to success choose payment
    Given I am on the payment pages
    When I select the payment method
    And I click the Pay Now button
    Then I am on the payment confirmation page
    When I click Payment Instructions with Scan
    And I open the Gojek application then head to the GoPay menu
    Then I select the Pay feature
    When I do a scan of the payment
    And I enter your 6-digit GoPay PIN
    Then I am on the paid success page
