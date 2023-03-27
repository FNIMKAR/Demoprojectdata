package com.cg.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "driver1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String unm, String pass)  {
		driver.findElement(By.id("email")).sendKeys(unm);
		driver.findElement(By.id("pass")).sendKeys(pass);
	  
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   driver.findElement(By.id("loginbutton")).click();
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
	  Assert.assertTrue(driver.getTitle().contains("jhkjhk"));
	}

	@Then("user is on same page")
	public void user_is_on_same_page() {
		 Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}
}
