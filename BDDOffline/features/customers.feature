Feature: Customers

# Background steps will run before each scenario in the current feature file
Background: Below are the common steps

	Given user launches chrome browser 
	When user opens url "https://admin-demo.nopcommerce.com/" 
	And user enters email as "admin@yourstore.com" and password as "admin" 
	And click on login 
	Then page title should be "Dashboard / nopCommerce administration" 
	When user click on customers menu 
	And user click on customers option	

Scenario: Add a new customer
 
	And user click on Add new button 
	Then page title should be "Add a new customer / nopCommerce administration" 
	When user enters customer info 
	And click on save button 
	Then user can see confirmation message "The new customer has been added successfully" 
	And close browser 
	
Scenario: Search customer by emailID

	And enter customer email
	When click on search button
	Then user should see email in the search table
	And close browser
	
Scenario: Search customer by name

	And enter customer first name
	And enter customer last name
	When click on search button
	Then user should name in search table
	And close browser 