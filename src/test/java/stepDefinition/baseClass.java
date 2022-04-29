package stepDefinition;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import junit.framework.Assert; 

public class baseClass {
	 
	   public static WebDriver driver;
	   
	   public void openBrowser() { 
		   System.setProperty("webdriver.chrome.driver","D:\\Nitin\\chromedriver.exe");
		   System.out.println("opening browser");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
	   } 
	   
	   public void launchUrl(String url) {

		   System.out.println("check   "+ url);
		   driver.get(url);

	   }
	   public void clickButton(String locator) {
		  driver.findElement(By.xpath(locator)).click();
		  
		  System.out.println("  checking the checks");
		 
	   }
	   public void verifyTitle(String expectedText, String actualText) {
		   String title = getText(actualText);
		   	Assert.assertEquals(expectedText, title);
		   
	   } 
	   
	   public void verifyText(String expectedText, String actualText) {
		   	Assert.assertEquals(expectedText, actualText);
		   
	   } 
	   
	   public String getText(String locator) {
		   	return driver.findElement(By.xpath(locator)).getText();
			  
		  }
	   public void setValue(String locator , String value) {
		   	 driver.findElement(By.xpath(locator)).sendKeys(value);
			  
		  }
	   
	   
	   
	   public boolean isPresent(String locator) {
		   return driver.findElement(By.xpath(locator)).isDisplayed();
	   }
		 
	   
	}


