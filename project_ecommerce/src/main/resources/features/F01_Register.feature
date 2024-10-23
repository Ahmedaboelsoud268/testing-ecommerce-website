@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given the user click on star selling
    And the user go to the get started page
    And the user go to the set up your stroe page
    And the user add address store
    And the user compeletion the store
    Then the user go to the home page

    Scenario: the user try to create account with exist email
      Given the user click on star selling
      When the user go to the set up your stroe page and enter exist email
      Then error message is displayed