@tag2
	Feature: Search Employee  
  Scenario Outline: To verify employee seaarch functionality
    Given the user is on the dashboard page with valid login credentials username as Admin and password as admin123
    When User navigate to PIM -> Employee List
    Then User Enter valid employee Id 0320
    Then Click onn serarch Button