#Author: your.email@your.domain.com
#Keywords Summary :

Feature: Mercury signup panel

  Scenario: Mercury signup module testing with positive data
    Given user is on the mercury signup page
    And users enters firstname "John" for positive data
    When user enters last name mercury signup "Bob" for positive data
    And user enters email  "test@test" for positive data
    And user enters phone number "5245367657" for positive data

 
  Scenario: mercury signup module testing with negative data
    Given user is on the mercury signup page 
    When user enters first name mercury signup page "String" for nagative data
    Then user enters last name mercury signup page "John" for negative data
    And user enters phone number mercury signup page "John" for negative data
    And user enters email mercury signup page "name@name" for negative data

    