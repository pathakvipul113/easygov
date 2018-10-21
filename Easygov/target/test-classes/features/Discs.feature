Feature: Discs feature scenarios

Background: User is on Discs page
When User click on Discs button from the left sidebar
Then User should be successfully navigated to Discs page

@tear_up1 @delete_disc
Scenario: Verify user is able to create Photo DVD Disc
Given User clicks on START WIZARD button
Then User select media files from Album 'Album1' and 'Album2' of Photo DVD Disc type
Then user consolidate files into Smaller DVDs
Then User should be able to create consolidated Photo DVD Disc 'Disc 1'

@tearDown
Scenario: Close browser session
Given User close the browser
