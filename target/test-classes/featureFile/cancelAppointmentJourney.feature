Feature: Verify the succesfull cancellation of a booked appointment
  

Scenario Outline: Check the status of the already booked appointment
    Given I have open the browser
		When I open the "<url>"
		Then I validate the Login page navigated
		When I click on sign in button
		When I enter "<userName>" and "<password>"
		And I click on login button
		Then I validate the Home page navigated
		When I click on check status button
		Then I validate the Status Page navigated



    Examples: 
      | url  									| userName | password  |
      | https://google.co.in 	|     abc  | 123	 |
      #| name2 								|     abcd | 123   	 |
