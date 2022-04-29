package pages;

import org.openqa.selenium.By;

import copyText.loginCopyText;
import pageObject.loginPageObject;
import stepDefinition.baseClass;

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

public class loginPage extends baseClass {
	
	
	
	
	public void verifyLoginPageTitle() {
		verifyTitle(loginCopyText.title , loginPageObject.title);
		System.out.println("title verified succesfully");
	}
	
	public void login(String userName, String password) {
		setValue(loginPageObject.userName, userName);
		setValue(loginPageObject.password, password);
		
	}
	
	public void clickLogin() {
		clickButton(loginPageObject.loginButton);
		
	}
	
	public void clickSignIn() {
		System.out.println("test2  "+loginPageObject.signInButton );
		clickButton(loginPageObject.signInButton);
		
		System.out.println("clicked on sign in button");
		
	}

}
