package com.cg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.page.BasePage;

public class LoginPage extends BasePage{
	
	//Data members: web ele present on the UI 
	//member methods: interaction with those web ele
	@FindBy(xpath = "//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='loginbutton']")
	private WebElement loginbtn;
	
	public LoginPage()
	{
		super();//BasePage ctor will be invoked. : Driver initilizaition
		//page load
		pageLoad();
		//intilization of Page obj through PageFactory
		PageFactory.initElements(driver,this);
		
	}
		
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
	}

	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickButton()
	{
			loginbtn.click();
	}
}
