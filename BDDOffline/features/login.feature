Feature: Login

Scenario: successful login with correct credentials

	Given user launches chrome browser 
	When user opens url "https://admin-demo.nopcommerce.com/" 
	And user enters email as "admin@yourstore.com" and password as "admin" 
	And click on login 
	Then page title should be "Dashboard / nopCommerce administration" 
	And close browser 