Feature: List user
    As a user
    I want to see my home page
    So that I can update my profile

  Scenario: As user i have be able to success choose product
    Given I am on the main page
    When I click on the other buttons on the menu bar available to view and select the type of product
    And I select and click on one of the product categories, for example: Selecting the Telecommunications category
    Then I selects and clicks the desired product, for example: selecting the pulse product
    When I enter a valid mobile number
    Then I am on the payment page
