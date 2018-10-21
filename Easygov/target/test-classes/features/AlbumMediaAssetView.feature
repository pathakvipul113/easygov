Feature: Album Media Asset View feature scenarios

@tear_up
Scenario: Initiate browser
When User enter valid username and password
Then User is logged in successfully

#Scenario: Verify user is able to add selected file to a disc
#Given User click on the existing Album 'Album1'
#Then User Select a file
#And Add selected file to a disc
#Then User should be able to add the selected file to a disc successfully  

Scenario: Verify user is able to share selected file via shared link
Given User click on the existing Album 'Album1'
Then User Select a file to share
And Share the selected file via shared link
Then User should be able to share the selected file successfully

#Scenario: Verify user is able to delete selected file
#Given User click on the existing Album 'Album1'
#Then User Select a file to delete
#And Delete the selected file
#Then User should be able to delete the selected file successfully

@tearDown
Scenario: Close browser session
Given User close the browser