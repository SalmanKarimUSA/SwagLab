Feature: As a Swag Labs customer, it display saying user are banned when lockedOutUser userID is used.

  Scenario: 2 Failed Login
  
    Given browser is open
    And I am on the Sauce Demo Login Page
    When I fill the account information for account LockedOutUser into the Username field and the Password field
    And I click the Login Button
    Then I verify the Error Message contains the text "Sorry, this user has been banned."
    