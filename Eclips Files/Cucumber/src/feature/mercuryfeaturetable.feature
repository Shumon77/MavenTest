
Feature: Mercury signup panel
  
  Scenario Outline: mercury signup module test with multiple sets of data
    Given user is on the signup page
    And user enters first name with <firstname>
    When user enters last name with <lastname>
    And user can close the browser
   
  
  
    Examples: 
      | firstname |lastname |
      |John       |Bob      |
      |String     |Vence    |
      |313240     |Jef      |
      |Clarck     |Jem      |
