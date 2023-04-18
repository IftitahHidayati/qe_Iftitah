#@delete
Feature: delete
  As a user
  I want to see my home page
  So that I can update my profile

#  @userA
  Scenario: As user i have be able to success delete
    Given I am on the my profile page
    When I click my all activities
    And I choose the post you want to delete
    When I click the three dots in the upper right corner of the activity area
    And click delete
    Then I am on the profile page with notification post deleted successfully