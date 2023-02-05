Feature: varify login system
Scenario: as a user should be login using valid system
Given open brouser
And go to facebook.com
When user type valid userid in valid user name textbox
And user type valid password in valid password textbox
And user click in login button
Then user should see his profile page


Scenario Outline: as a user should be login using invalid system
Given open brouser
And go to facebook.com
When user type "<invalid_userid>" in valid user_name textbox
And user type "<invalid_password>" in valid password textbox
And user click in login button
Then user should  not see his profile page

Examples: 
|invalid_userid|invalid_password|
|user1|p123|
|user2|p456|
|user3|p789|