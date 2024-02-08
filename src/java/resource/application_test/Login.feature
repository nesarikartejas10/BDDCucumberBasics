Feature: Login functionality
Scenario: Login validation with valid credentials
Given User is at login page
When User enters username
And User enters password
And User click on login button
Then User should redirect to the home page
