@navigateMenu
Feature: Navigation Menu
  Scenario: Navigating to Developers Menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    And The user navigates to Developers menu
    Then The user able to see developer text

    Scenario: Navigating All Posts Menu
      Given The user is on the login page
      When The user enters student credentials
      Then The user should be able to see welcome message
      And The user navigates to All Posts menu
      Then The user able to see All Posts text

  Scenario: Navigating to My Account Menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    And The user navigates to My Account menu
    Then The user able to see Dashboard text







