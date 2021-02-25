Feature: Test Login functionality
  I want to use this template for my feature file

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
