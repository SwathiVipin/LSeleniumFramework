package pages;

import stepDefinition.baseClass;
import copyText.homeCopyText;
import pageObject.homePageObject;
import pageObject.loginPageObject;

public class homePage extends baseClass {
	
	  
	public void verifyHomePageTitle() {
		
		if(isPresent(loginPageObject.loginErrorMsg)){
			System.out.println("please enter a valid credential");
		}
		else		
		verifyTitle(homeCopyText.title,homePageObject.title);
		System.out.println("title verified succesfully i.e appointment page");
	}
	
    public void verifyHomePagecontents() {
		
    	verifyText(homeCopyText.title,homePageObject.title);
		System.out.println("contents verified succesfully");
	}
    
    public void verifyCheckStatusButton() {
		isPresent(homePageObject.checkStatus);
		System.out.println("checkStatus button is present");
	}
    
    public void verifyResceduleCancelButton() {
		isPresent(homePageObject.rescheduleCancel);
		System.out.println("rescheduleCancel button is present");
	}
    
    public void verifyBookAnAppointmentButton() {
		isPresent(homePageObject.bookAnAppointment);
		System.out.println("bookAnAppointment button is present");
	}
    
    public void clickCheckStatus() {
    	clickButton(homePageObject.checkStatus);
		
	}

}
