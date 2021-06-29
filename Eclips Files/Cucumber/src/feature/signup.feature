
Feature: testing signup

  Scenario: title of the scenario will be written
    Given user is on the signup page
    When user enters username
    And user enters new password
    And user enters first name
    And user enters last name
    And user clicks on the signup button
    Then new account for the user should be created
    And user should navigate to the new account page
