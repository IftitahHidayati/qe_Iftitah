@login

Feature: login
  As a user
  I want to see my home page
  So that I can buy product

#  Disini terdapat 2 test case positif dengan username berbeda
  @Normal-User
  Scenario Outline: As user i have be able to success login
    Given I am on the login page
    When I input valid "<username>" username
    And I input valid password
    And I click login button
    Then I am on the home page
    Examples:
    |username      |
    |standard_user |
    |problem_user  |

# Disini terdapat 1 test case negatif dengan locked username
  @Locked-User
  Scenario: As user, I have beed locked out
    Given I am on the login page
    When I input locked username
    And I input valid password
    And I click login button
    Then I can see error message "Epic sadface: Sorry, this user has been locked out."
