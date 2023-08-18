package com.stepdefinition;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import com.pages.AddCustomersPage;
import com.pages.LoginPage;
import com.pages.SearchCustomerPage;

public class BaseClass {

	WebDriver driver = null;
	LoginPage loginPage = null;
	AddCustomersPage addCustomersPage = null;
	SearchCustomerPage SearchCusPage = null;
	
	// each time this method is called it will return a random 5 char string, email of user should be diff 
	public static String randomString()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return generatedString1;
	}
}
