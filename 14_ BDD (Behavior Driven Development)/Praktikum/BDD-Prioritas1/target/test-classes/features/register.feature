#@register
Feature: register
  As a user
  I want to see my home page
  So that I can update my profile

#  @userA
  Scenario: As user i have be able to success register
    Given I am on the register page
    When I enter by valid first name, last name, email and password
    And I click join now button
    Then I am on the home professional profile
    When I enter by valid country, currently, job tittle, and company
    And I click create my profile
    When I am confirm email address
    Then I am on the login home page