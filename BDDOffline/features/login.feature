Feature: Login

Scenario: successful login with correct credentials

	Given user launches chrome browser 
	When user opens url "https://admin-demo.nopcommerce.com/" 
	And user enters email as "admin@yourstore.com" and password as "admin" 
	And click on login 
	Then page title should be "Dashboard / nopCommerce administration" 
	And close browser    

Scenario: Login as a new sign-up user with invalid data

Given I navigate to the Website
When I entered an invalid user name
And I entered the password
And click on the sign-in button
Then Error message should display
But Re-login option be available 	