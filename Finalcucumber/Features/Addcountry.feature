Feature: AddCountry
Scenario: Login with Valid and add country
Given  User Launches Chrome browser
When User opens url "https://xlogist.pisystindia.com/admin/login"
And User  enters Email as "admin@gmail.com" and password as "Charlie123"
And clicks on Login
Then clicks on Locations 
And click on country
Then clicks on add country
And user enters country as "India"
Then click on add
Then close the browser