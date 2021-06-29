#Author: your.email@your.domain.com
#Keywords Summary :

Feature: Signup module testing for facebook
  
  Scenario: testing fafebook with valid credentials 
    Given user is on the facebook homepage
    When user enters first name
    And user eners last name
    And user enters email address
    And user enters new password
    And user select birthday month
    And user select birth date
    And user select birth year
    And user clicks on the signup button
    Then user should have a new account
    And user should be in the new account
    And user enters first name
    
    
  Scenario: testing fafebook with valid credentials 
    Given user is on the facebook homepage 
    When user enters invalid first name
    When user enters invalid last name 
    Then user should not be able to create a login