Feature: Test login Application

  Scenario Outline: Test login successfully with valid credentials
    Given browser is open
    And user is on login page
    When user enter <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |
