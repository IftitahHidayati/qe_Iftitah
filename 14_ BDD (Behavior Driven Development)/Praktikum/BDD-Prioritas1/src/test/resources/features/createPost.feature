#@createPost
Feature: createPost
  As a user
  I want to see my home page
  So that I can update my profile

#  @userA
  Scenario: As user i have be able to success create post
    Given I am on the main page
    When I click and enter by post
    And I click post button
    Then I am on the home page with new post success create