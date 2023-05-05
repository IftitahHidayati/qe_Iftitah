@login
Feature: login sepulsa
  @userA
  Scenario: as a user i can login
    Given I am on the login page
    When I clicked the enter button
    And  I enter valid Email
    And I enter valid Password
    And I clicked the enter login
    Then i am on the home page

  @userB
  Scenario: As a user I can't login successfully
    Given I am on the login page
    When I clicked the enter button
    And  I enter invalid Email
    And I enter invalid Password
    And I clicked the enter login
    Then I can see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."

#  @login
#  Feature: login
#  As a user
#  I want to see my home page
#
#  @userA
#  Scenario: As user i have be able to success login
#    Given I am on the login page
#    When I enter correct email
#    And I enter correct password
#    And I click login button
#    Then I am on the home page
#
#  @userB
#  Scenario: As user i have be able to success login
#    Given I am on the login page
#    When I enter incorrect email
#    And I enter incorrect password
#    And I click login button
#    Then I can see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."
#
#  @userC
#  Scenario: As user i have be able to success login
#    Given I am on the login page
#    When I enter correct phone number
#    And I enter correct password
#    And I click login button
#    Then I am on the home page
#  @userD
#  Scenario: As user i have be able to success login
#    Given I am on the login page
#    When I enter incorrect phone number
#    And I enter incorrect password
#    And I click login button
#    Then I can see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."