Feature: Free CRM Login Feature

Scenario: Log In To Free CRM scenario

Given user is on login page
When page title is Free CRM
Then user clicks on the login button
Then user types the username and password
Then user again clicks on the login button
And user is on homepage
