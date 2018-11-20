Feature: Login Feature
Scenario: Valid Login Scenario
Given The URL of Demo Webshop
When User enters savik_1995@hotmail.com to username
And User enters hello123 as password
And User clicks on login button
Then User is valid


Scenario: Valid Login Scenario
Given The URL of Demo Webshop
When User enters savik_1995@hotmail.com to username
And User enters hello123 as password
And User clicks on login button
Then User is not valid


Scenario Outline: Valid Login Scenario
Given The URL of Demo Webshop
When User enters <username> to username
And User enters <password> as password
And User clicks on login button
Then User <result> is valid

|username|password|result|
|savik|hello123|pass|
|qwerrt|ghrfd|pass|
|dfdf|Dfdf|fail|




