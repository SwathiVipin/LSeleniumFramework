Feature: Verify login journey.
 

Scenario Outline: login to the application using existing users credencials

		Given I have open the browser
		When I open the "<url>"
		Then I click on sign in button
		And I validate the Login page navigated
		When I enter "<userName>" and "<password>"
		And I click on login button
		Then I validate the Home page navigated
	
	   Examples: 
      | url  											 | userName | password  |
      | http://192.168.44.229:3000/|     abc  | success	 |
      
      
      
