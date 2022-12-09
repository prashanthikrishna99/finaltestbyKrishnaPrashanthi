Feature: AddCity
Scenario: Login with Valid and add city
Given  User Launch Chrome browser
When User opens URL "https://products.pisystindia.com/Ecommerce/admin"
And User  enters Emails as "admin@gmail.com" and password as "123456"
And click on Login
Then click on Locations 
And click on city
Then click on add city
And user enters city as "Tirupathi"
Then clicks on add
Then close 