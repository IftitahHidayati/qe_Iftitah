@payment
Feature: login sepulsa
@UserD
  Scenario: as a user I can do payment
    Given I am on the login page
    When I clicked the enter button
    And  I enter valid Email
    And I enter valid Password
    And I clicked the enter login
    Then i am on the home page
    When I click icon product pulsa
    And I enter number phone
    And I click the nominal
    Then I am on the payment page
    When I am choose and click payment method
    And I click payment button
    Then I am on the scan barcode payment page