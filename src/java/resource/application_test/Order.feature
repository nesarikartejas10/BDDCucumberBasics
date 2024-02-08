Feature: Fetch order information

Background:
Given User should be logged into the application
When User click on order button
Then User should see order category button

Scenario: Fetch previously placed order
When User click on past order button
Then User should be able to see past order information

Scenario: Fetch current placed order
When User click on current order button
Then User should be able to see current order information