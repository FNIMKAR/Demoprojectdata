Feature: Login Feature
Scenario Outline: Negative login scenario

Given user is on login page
When user enters "<un>" and "<pass>"
And user clicks on login button
Then user is on same page
Examples:
|un|pass|
|admin|admin123|
|priti|priti124|
