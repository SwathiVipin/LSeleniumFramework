
Feature: Verify the status of booked appointment 
  

  
  Scenario Outline: Check the status of the already booked appointment
    Given I have open the browser
		When I open the "<url>"
		When I click on sign in button
		Then I validate the Login page navigated
		When I enter "<userName>" and "<password>"
		And I click on login button
		Then I validate the Home page navigated
		When I click on check status button
		Then I validate the Status Page navigated



    Examples: 
      | url  									| userName | password  |
      | http://192.168.44.229:3000/|     abc  | success	 |