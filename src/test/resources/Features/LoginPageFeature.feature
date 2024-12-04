@tag
Feature: Login Page

@tag1
Scenario: To verify that sucessful login with valid user name & password.

		Given I am on the landing page
 		And I enter username as Admin
		And I enter password as admin123
		And I click on login button  
		Then  I am on dashboard page is dispayed
		
		
		@tag1
Scenario: To verify that login with Invalid user name & password.

		Given I am on the landing page
 		And I enter username as Admi
		And I enter password as admin12
		And I click on login button  
		Then Error Message Displayed