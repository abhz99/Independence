package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver = null;
//=============================================================================	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//=============================================================================	
	@FindBy(id = "Email")
	private WebElement uname;
	
	@FindBy(id = "Email-error")
	private WebElement emailErrMsg;
	
	@FindBy(id = "Password")
	private WebElement pass;
	
	@FindBy(xpath = "//button")
	private WebElement loginButton;
	
//=============================================================================
	
	public void setUname(String email)
	{
		uname.clear();
		uname.sendKeys(email);
	}
	
	public void setPasswd(String passwd)
	{
		pass.clear();
		pass.sendKeys(passwd);
	}
	
	public void clickSignIn()
	{
		loginButton.click();
	}
}
