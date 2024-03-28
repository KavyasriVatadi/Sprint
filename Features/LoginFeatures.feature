Feature: To navigate into the Magicbricks website

Background: Login Successful
Given I am on Magic Bricks App Login page
When I enter Email ID as "bonelaharipriya2001@gmail.com"
And I click on Next
And I enter password as "Priya@123"
And I click Login
And I click on Continue
Then I am Logged in Successfully

Scenario: To navigate into My Dashboard
Given I am on the magicbricks website
When I click on sell dropdown
And I click on Agent & Builder
And I am able to click on My Dashboard
Then Dashboard page will be displayed.
@SanityTest
Scenario: To search the flats at a location
Given I am on the magicbricks website
#When I click on sell dropdown
#And I click on Agent & Builder
#When I am on My Dashboard page
When I click on search
Then the flats for sale for particular location will be displayed

Scenario: To search BHK
Given I am on the magicbricks website
When I click on search
And I am on the flats for sale page
When I click on BHK size
And I click on Done
Then the flats for sale page will be displayed

Scenario: To search for locality
Given I am on the magicbricks website
When I click on search
When I am on the flats for sale for BHK page
When I click on localities
And I click on particular locality
And click on Done
Then the flats for sale for particular locality page will be displayed

Scenario: To select the budget
Given I am on the magicbricks website
When I click on search
And I am on the flats for sales for locality page
When I click on budget
And select the minimum budget and maximum budget
And click on Done
Then the flats for sale for particular budget will be displayed

