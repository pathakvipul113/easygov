Feature: SignUp feature scenarios

@tear_up
Scenario:
Given User is on login page
Then User clicks on Signup button

@1
Scenario Outline: Verify user is not able to Signup with existing email address
When User enter <FirstName> as First Name
And User enter <LastName>  as Last Name
And User enter <Email> as Email address
And User enter <Password> as password
Then User click on SignUp button
Then User should not be able to create new account
Then User click on Login button
Given User is on login page
Then User clicks on Signup button

Examples: 
        | FirstName       | LastName        |Email              | Password |
        | test_first_name | test_last_name  |matest6@032818.com  |123456    |

@2
Scenario: Verify new user is able to Signup with iMemories
When User enter data in the required fields
| Fields                 | Values          |
| Email Address          | signupemailId   |
| First Name             | test_first_name |
| Last Name              | test_last_name  |
| Password               | 123456          |
And User click on SignUp button
Then new user navigates to empty Albums page


