Feature: Google Search Functionality

  Scenario: Verify that user is able to search through Google search bar
    Given User has opened browser
    And User is on Google search page
    When user enters text
    And hits enter
    Then user is navigated to search results
