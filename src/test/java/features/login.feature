Feature: Application login with different credentials

Scenario Outline: login with valid credentials
Given open browser
And navigate to login page
When user enter username as "<username>" and password as "<password>" in the required field
And user clicks on login button
Then verify if user is able to login when expected condition is met
Examples:
|username					 |password |
|surendhar@mail.com|surendhar|