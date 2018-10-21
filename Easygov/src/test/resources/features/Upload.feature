Feature: Test Smoke Scenarios for iMemories


Background: User is on Upload page
When User click on Upload button from the left sidebar
Then User should be successfully navigated to Upload page

@tear_up @smoke
Scenario: Verify user is able to create new Album from Upload page
Given User open the Upload Dialog popup
And Enter Album Title 'Upload Album' and Description 'Upload Desc' 
And click the save button
Then User is able to view the newly created Album with Title 'Upload Album' in Upload to dropdown

@2 @closedialog @after_delete_album2
Scenario: Verify user is able to upload Images to an album from Upload page using Select Files feature
Given User upload '1' image/s file in album 'test_album'
Then User should be able to successfully upload image file in 12 seconds

@tearDown
Scenario: Close browser session
Given User close the browser