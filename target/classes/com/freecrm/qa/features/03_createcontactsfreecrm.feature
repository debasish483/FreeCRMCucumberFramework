Feature: Free CRM Create Contact and Deal Feature

Scenario Outline: Create contacts and deals in FreeCRM

Given user is on the contacts page
Then clicks on the New button
Then fills the required "<Name>" name and "<SurName>" surname
And clicks on Save button

Examples: 
|Name|		|SurName|
|FirstName| |LastName|

Scenario:
When new contact is created
Then user clicks on Deals link
And user clicks on the New link
Then user enters title, probability, amount and commission
|Title| Probability|Amount | Commission|
And user clicks on Save button to create a deal





