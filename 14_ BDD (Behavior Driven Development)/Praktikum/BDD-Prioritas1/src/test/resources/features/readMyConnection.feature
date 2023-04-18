#@readMyConnection
Feature: readMyConnection
  As a user
  I want to see my home page
  So that I can update my profile

#  @userA
  Scenario: As user i have be able to success read my connection
    Given I am on the home
    When I click my network feature
    And I click the connection menu
    Then I am on the connection page