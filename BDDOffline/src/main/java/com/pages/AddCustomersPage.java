package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomersPage {

	public WebDriver driver = null;
//=============================================================================		
	public AddCustomersPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//=============================================================================		
	
}
