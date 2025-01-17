Feature: User
  As a admin
  I want to see list of user
  So that I can create new user

  Scenario: GET - As admin I have be able to get detail user
    Given I set Get api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user

  Scenario: PUT - As admin I have be able to to update existing user
    Given I set PUT endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for existing user

  Scenario: POST - As admin I have be able to to create new user
    Given I set POST endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

  Scenario: DELETE- As admin I have be able to to delete existing user
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200
