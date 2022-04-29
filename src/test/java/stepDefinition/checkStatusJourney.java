package stepDefinition;

import org.openqa.selenium.By;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import pages.homePage;
import pages.loginPage;

public class checkStatusJourney extends baseClass{
	


	loginPage loginPageObj = new loginPage();
	homePage homePageObj = new homePage();
	
		@When("^I click on check status button$")
		public void I_click_on_check_status_button() {
			homePageObj.clickCheckStatus();
		   
		}
		
		@Then("^I validate the Status Page navigated$")
		public void I_validate_the_Status_Page_navigated() {
			
			driver.findElement(By.xpath("locator"));
		
		}
		
}
