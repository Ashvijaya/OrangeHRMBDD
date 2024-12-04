@tag1
 Feature: Add Employee

 Scenario Outline: Successfully add a new employee
    Given the user is on the dashboard page with valid login credentials username as Admin and password as admin123
    When the user clicks on PIM option
    And the user clicks on Add Employee option
    Then I enters valid data in the mandatory fields "<Firstname>" and "<Lastname>"
    And the user uploads a photo
    And the user clicks on the Save button
    Then the employee list page should be visible with employee details
    
    	 Examples:  
       | Firstname | Lastname |
       |Jhon       | Doe      |