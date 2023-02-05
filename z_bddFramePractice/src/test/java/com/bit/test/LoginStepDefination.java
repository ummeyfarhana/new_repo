package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	WebDriver dr;
	@Given("^open brouser$")
	public void open_brouser() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "");
	   dr=new ChromeDriver();
	   
	}

	@Given("^go to facebook\\.com$")
	public void go_to_facebook_com() throws Throwable {
	    dr.get("https://www.facebook.com/");
	}

	@When("^user type valid userid in valid user name textbox$")
	public void user_type_valid_userid_in_valid_user_name_textbox() throws Throwable {
	    dr.findElement(By.id("")).sendKeys("");
	}

	@When("^user type valid password in valid password textbox$")
	public void user_type_valid_password_in_valid_password_textbox() throws Throwable {
	    dr.findElement(By.id("")).sendKeys(null);
	}

	@When("^user click in login button$")
	public void user_click_in_login_button() throws Throwable {
	    dr.findElement(By.id("")).click();
	}

	@Then("^user should see his profile page$")
	public void user_should_see_his_profile_page() throws Throwable {
	    if(dr.findElement(By.id("profileLogo")).isDisplayed()) {
	    	System.out.println("profile is varified succesfully");
	    }
	}
	@When("^user type \"([^\"]*)\" in valid user_name textbox$")
	public void user_type_in_valid_user_name_textbox(String arg1) throws Throwable {
	    dr.findElement(By.id("")).sendKeys(arg1);
	}

	@When("^user type \"([^\"]*)\" in valid password textbox$")
	public void user_type_in_valid_password_textbox(String arg1) throws Throwable {
	    dr.findElement(By.id("")).sendKeys(arg1);
	}

	@Then("^user should  not see his profile page$")
	public void user_should_not_see_his_profile_page() throws Throwable {
	    if(dr.findElement(By.id("profileLogo")).isDisplayed()) {
	    	System.out.println("profile is not varified succesfully");
	    }
	}



}
