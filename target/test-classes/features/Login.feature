Feature: Application Login

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@RegTest @SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "jin" and password "1234"
Then Home page is populated
And Cards displayed are "false"

@RegTest @MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | abcd | john@abcd.com | Australia | 324578 |
Then Home page is populated
And Cards displayed are "false"

@RegTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login to application with username <Username> and password <Password>
Then Home page is populated
And Cards displayed are "true"

Examples:
| Username | Password |
| user1     | pass1    |
| user2     | pass2    |
| user3     | pass3    |


