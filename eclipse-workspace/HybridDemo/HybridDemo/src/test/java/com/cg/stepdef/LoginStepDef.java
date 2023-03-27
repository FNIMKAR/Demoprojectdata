package com.cg.stepdef;

import org.junit.Assert;

import com.cg.pages.LoginPage;
import com.utils.CaptureScreeShot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	LoginPage lp;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   lp=new LoginPage();//call ctors: parent : child
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String unm, String psw) {
	   lp.enterUsername(unm);
	   lp.enterPassword(psw);
	   
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	lp.clickButton();
	}
	@Then("user is on same page")
	public void user_is_on_same_page() {
	   Assert.assertTrue(lp.driver.getTitle().contains("kjk"));
	}

	@After
	public void tearDown(Scenario sc) {
		if(sc.isFailed())
			CaptureScreeShot.captureScreen();
		
	    lp.driver.close();
		
	}
	
}
