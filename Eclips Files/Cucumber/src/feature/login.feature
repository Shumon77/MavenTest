
Feature: login
  
  Scenario: testing the log in page url from homepage
    Given user is on the home page  
    When user click on the log in link 
    Then user should navigate to the log in page

 
  Scenario Outline: testing the login panel with valid credentials
    Given user is on the login page
    When user enters right username
    And user enters right passward
    Then user should be able to login

    