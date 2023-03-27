Feature: Login feature
Scenario: possitive login scenario

Given user is on login page
When user enter "admin" and "admin123"
And user clicks on login button
Then user is on home page


Scenario Outline: Negative Login Scenario
Given user is on login page
When user enter "<user>" and "<password>"
And user clicks on login button
Then user is on same page

Examples:
|user|password|
|admin|admin123|
||admin123|
|admin||
|priti|priti1234|
