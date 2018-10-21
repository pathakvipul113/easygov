Feature: Album feature scenarios

@tear_up
Scenario: Initiate browser
When User enter valid username and password
Then User is logged in successfully

@smoke @after_delete_album
Scenario: Verify user is able to create new Album from Album's page
Given User click on Add New Album
Then ADD NEW ALBUM modal is displayed
And User enter Album Title 'create_album_test' and Description 'testing description' 
And User click the save button
Then User is able to view the newly created Album with Title 'create_album_test'

@smoke
Scenario: Verify user is able to Edit existing Album' name from Album's page
Given Album name 'name album test' exists
And User changes Album name from 'name_album_test' to 'random name album test' 
Then User is able to view the new Album name 'random name album test' 

@smoke
Scenario: Verify user is able to Delete an Album from Album's page
Given User click on Add New Album
Then ADD NEW ALBUM modal is displayed
And User enter Album Title 'delete_test' and Description 'testing description' 
And User click the save button
Then Album name 'delete_test' exists
And User click on Inhand menu of 'delete_test' 
And click delete Album option
And click YES on Confirmation dialog
Then User is able to successfully delete Album name 'delete_test'

@smoke @after_delete_album1
Scenario: Verify user is not able to Download Blank Album from Album's page
Given User click on Add New Album
Then ADD NEW ALBUM modal is displayed
And User enter Album Title 'Album_test_2' and Description 'testing description' 
And User click the save button
Given Album name 'Album_test_2' exists
Then user click on Inhand menu of 'Album_test_2'
Then 'Download Album' is not displayed in the menu

@tearDown
Scenario: Close browser session
Given User close the browser