package stepDefinition;
	 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber;
//import 


	@RunWith(Cucumber.class) 
	@Cucumber.Options(features={"featureFile/loginJourney.feature"}, glue =  "")
	
	//src\\test\\java\\featureFile\\login.feature
	//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 
	//format = {"pretty", "html:target/cucumber"} ,
	//, tags = {"~@SmokeTest"}) 
    //,glue =  "steps"
	

public class runner {
		
		

	}
	
//
//	//notes
//	https://www.tutorialspoint.com/cucumber/cucumber_java_testing
//	https://stackoverflow.com/questions/34772622/how-to-run-single-cucumber-feature-files-through-command-prompt-and-through-jenk
//	https://chromedriver.storage.googleapis.com/index.html?path=84.0.4147.30/
//	http://www.automationtestinghub.com/cucumber-test-runner-class-junit/
	
	