Feature: Feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given User is on login page
    When User enters username and password
    And click on login button
    Then User is navigated to home page
