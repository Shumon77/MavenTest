#Author: your.email@your.domain.com
#Keywords Summary :


Feature: Signup test


Scenario: testing the signup page with valid credentials


Given user is in the signup page
When user enters first name
And user enters last name
And user clicks on the signup button
Then user should be logged in

Scenario: testing the signup page with invalid credentials


Given user is in the signup page  with invalid credentials 
When user enters invalid first name
And user enters invalid last name
And user clicks on the signup
Then user should be logged in again