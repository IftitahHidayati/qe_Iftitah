#Feature: Auth
#
#  @RegisterSuccess
#  Scenario: As a user I have successfully registered
#    Given me on the register page
#    When I enter a full name "Iftitah Hidayati"
#    And I entered a email "tita123@gmail.com"
#    And I entered a password "kotakoritita18"
#    And I click the register button
#    Then I'm on the login page
#
#  @RegisterBlankFullname
#  Scenario: As a user I have failed registered
#    Given me on the register page
#    And I entered a email "tita123@gmail.com"
#    And I entered a password "kotakoritita18"
#    And I click the register button
#    Then I'm can see error message "email required"
#
#  @RegisterBlankEmail
#  Scenario: As a user I have failed registered
#    Given me on the register page
#    When I enter a full name "Iftitah Hidayati"
#    And I entered a password "kotakoritita18"
#    And I click the register button
#    Then I'm can see error message "email required"
#
#  @RegisterBlankPassword
#  Scenario: As a user I have failed registered
#    Given me on the register page
#    When I enter a full name "Iftitah Hidayati"
#    And I entered a email "tita123@gmail.com"
#    And I click the register button
#    Then I'm can see error message "password required"
#
#  @RegisterWithoutData
#  Scenario: As a user I have failed registered
#    Given me on the register page
#    And I click the register button
#    Then I'm can see error message "fullname required"
#
#  @LoginSuccess
#  Scenario: As user i have be able to success login
#    Given I am on the login page
#    When I enter email "tita123@gmail.com"
#    And I enter password "kotakoritita18"
#    And I click login button
#    Then I am on the home page
#
#  @LoginInvalidEmail
#  Scenario: As user i have be able to success login
#    Given I am on the login page
#    When I enter email "abc@gmail.com"
#    And I enter password "kotakoritita18"
#    And I click login button
#    Then I'm can see error message "email or password is invalid"
#
#  @LoginBlankEmail
#  Scenario: As user i have be able to success login
#    Given I am on the login page
#    And I enter password "kotakoritita18"
#    And I click login button
#    Then I'm can see error message "email is required"
#
#  @LoginBlankPassword
#  Scenario: As user i have be able to success login
#    Given I am on the login page
#    When I enter email "abc@gmail.com"
#    And I click login button
#    Then I'm can see error message "password is required"
