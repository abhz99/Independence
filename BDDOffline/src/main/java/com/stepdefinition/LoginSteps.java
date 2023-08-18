package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.AddCustomersPage;
import com.pages.LoginPage;
import com.pages.SearchCustomerPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass{
	
// Successful Login steps.................................
	
	@Given("^user launches chrome browser$")
	public void user_launches_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}

	@When("^user opens url \"([^\"]*)\"$")
	public void user_opens_url(String url)
	{
	    driver.get(url);	// "url" we are passing from the features file
	}

	@When("^user enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_email_as_and_password_as(String email, String password) 
	{
	    loginPage.setUname(email);		// "email" we are passing from the features file
	    loginPage.setPasswd(password);	// "password" we are passing from the features file
	}

	@When("^click on login$")
	public void click_on_login() 
	{
	    loginPage.clickSignIn();
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title)
	{
	    Assert.assertEquals(title, driver.getTitle());
	}
	
	@Then("^close browser$")
	public void close_browser()
	{
	    driver.close();
	}
	
// Add new customer steps................
	
	@When("^user click on customers menu$")
	public void user_click_on_customers_menu() 
	{
	    addCustomersPage = new AddCustomersPage(driver);
	}

	@When("^user click on customers option$")
	public void user_click_on_customers_option() 
	{
	    
	}

	@When("^user click on Add new button$")
	public void user_click_on_Add_new_button() 
	{
	    
	}

	@When("^user enters customer info$")
	public void user_enters_customer_info() 
	{
	    
	}

	@When("^click on save button$")
	public void click_on_save_button() 
	{
	    
	}

	@Then("^user can see confirmation message \"([^\"]*)\"$")
	public void user_can_see_confirmation_message(String arg1) 
	{
	    
	}
	
// Search customer by emailID steps.............
	
	@When("^enter customer email$")
	public void enter_customer_email() 
	{
	 	SearchCusPage = new SearchCustomerPage(driver);
	}

	@When("^click on search button$")
	public void click_on_search_button() 
	{
	    
	}

	@Then("^user should see email in the search table$")
	public void user_should_see_email_in_the_search_table()
	{
	   
	}

// Search customer by name steps....................	
	
	@When("^enter customer first name$")
	public void enter_customer_first_name() 
	{
	    
	}

	@When("^enter customer last name$")
	public void enter_customer_last_name() 
	{
	    
	}

	@Then("^user should name in search table$")
	public void user_should_name_in_search_table() 
	{
	    
	}

}
