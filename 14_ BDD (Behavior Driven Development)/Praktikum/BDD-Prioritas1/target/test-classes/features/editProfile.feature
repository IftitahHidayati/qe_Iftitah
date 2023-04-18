#@editProfile
Feature: editProfile
  As a user
  I want to see my home page
  So that I can update my profile

#  @userA
  Scenario: As user i have be able to success edit profile
    Given I am on the profile page
    When I click the edit button or pencil icon
    And I enter data changes in the fields
    When I click save
    Then I am on the profile page with notification saved successfully