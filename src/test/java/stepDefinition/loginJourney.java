package stepDefinition;

import java.sql.Driver;


//package stepDefinition; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 

import org.openqa.selenium.chrome.*;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;
import pageObject.loginPageObject;
import pages.homePage;
import pages.loginPage; 

public class loginJourney extends baseClass {
	
	loginPage loginPageObj = new loginPage();
	homePage homePageObj = new homePage();
	
	
	@Given("^I have open the browser$") 
	public void haveOpenTheBrowser() { 

		System.out.println("broswer opened");
		openBrowser();
		System.out.println("broswer opened");
	     
	   } 
		
	@When("^I open the \"([^\"]*)\"$")
	public void I_open_the_Url(String arg1) {
		
		launchUrl(arg1);
		System.out.println("url launched successfully");
	      
	   } 
	
	@Then("^I click on sign in button$")
	public void I_click_on_sign_in_button() {
		System.out.println("test");
		clickButton(loginPageObject.signInButton);
		//loginPageObj.clickSignIn();
		System.out.println("clicked on sign in button");
		
		
	}
	
	@Then("^I validate the Login page navigated$")
	public void I_validate_the_Login_page_navigated() {
		loginPageObj.verifyLoginPageTitle();
		System.out.println("sign in page title verified");
		
	}
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_and_credentials(String arg1, String arg2) {
		loginPageObj.login(arg1, arg2);
		System.out.println("successfully entered the username and password");
		
	}
	
	@When("^I click on login button$")
	public void I_click_on_login_button() {
		loginPageObj.clickLogin();
		System.out.println("clicked on login button");
		
	}
	   
		
	@Then("^I validate the Home page navigated$")
	public void I_validate_the_Home_page_navigated() {
		homePageObj.verifyHomePageTitle();
		homePageObj.verifyHomePagecontents();
		homePageObj.verifyCheckStatusButton();
		homePageObj.verifyResceduleCancelButton();
		homePageObj.verifyBookAnAppointmentButton();
		
		
		   
	   }
}
