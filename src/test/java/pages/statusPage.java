package pages;

import copyText.homeCopyText;
import pageObject.homePageObject;
import stepDefinition.baseClass;

public class statusPage extends baseClass {
	
public void verifyStatusPageTitle() {
		
		verifyTitle(homeCopyText.title,homePageObject.title);
		System.out.println("title verified succesfully i.e appointment page");
	}
	
    public void verifystatusOfAppointment() {
		//need to write the logic
    	verifyText(homeCopyText.title,homePageObject.title);
		System.out.println("contents verified succesfully");
	}

}
