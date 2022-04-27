Feature: Login Action

#Scenario: Successful Login with Valid Credentials
Scenario Outline: Successful Login with Valid Credentials using Scenario
    Given User is on Index Page
    When User Navigate to Login Page
    And User enters Username and Password
    #And User enters "<testuser" and "Password@123"
    And User enters "<username"> and <"password>"
    #And User enters "emp1" and "pass1"
    Then Message displayed Login Successfully
    
    Examples:
    | username   | password |
    | emp1 		 | pass1 	|
    | emp2	     | pass2    |
  