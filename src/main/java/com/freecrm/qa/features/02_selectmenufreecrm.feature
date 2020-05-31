Feature: Free CRM Select Menu Feature

Scenario Outline: Select menu in Free CRM homepage

Given user is on the homepage
Then user clicks on the required "<Menu>"
And user lands on the contacts page

Examples:
|Menu|
|MenuName|