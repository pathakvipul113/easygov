Feature: FullScreen feature scenarios

@tear_up
Scenario: Initiate browser
When User enter valid username and password
Then User is logged in successfully


Scenario:
And User click on 'fgf' album
Then User should be able to access Media Asset page
And User click on any media file
#Then User should be able to view media file in Full Screen View   


Scenario: Verify user is able to change media by clicking next arrow
#When User click PlayPause button
#Given The first media file name is 'star_trails'
Then User click on next arrow button
#Then The second media file name is '%5EE5C737BEF0FE2147242090CDB0C2A3DE859BA92D50A53BA426%5Epimgpsh_fullsize_distr'
#Then User should be able to view changed media file

@closebrowser
Scenario: Close browser session
Given User close the browser
