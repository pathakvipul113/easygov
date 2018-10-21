Feature: Test Smoke Scenarios for iMemories

@tear_up
Scenario: Initiate browser
When User enter valid username and password
Then User is logged in successfully


@smoke
Scenario: Verify user is able to signout from the application
When User click on hamburger_menu button
And User click on sign_out button
Then Signout confirmation dialog is displayed
And User click on Yes button
Then User is successfully able to signout from the application

@tearDown
Scenario: Close browser session
Given User close the browser

