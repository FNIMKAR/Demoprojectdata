Feature: Register Feature
# this is dummy register feature

Scenario: possitive registeration scenario
Given user is on registration page
When user enters the details
|username|priti|
|password|priti1234|
|confirmpass|priti1234|
|mobile|65787698|
|company|capgemini|
And user clicks on submit button
Then user is succesfully registered