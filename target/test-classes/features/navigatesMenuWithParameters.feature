Feature: Navigate to Menu Parameters

  Background:
    Given The user is on the login page

    @smoke
  Scenario: User navigates to Developers Menu

    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "umut"
    And The user navigates to "Developers" menu
    Then The user should be able to see  header as "Filter Profiles by Skill or by Location"


      @smoke
  Scenario: User navigates to All Posts Menu

    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user navigates to "All Posts" menu
    Then The user should be able to see  header as "Posts"

        @smoke
  Scenario: User navigates to My Account Menu

    When The user logs in using "berlin@gmail.com" and "berlin"
    Then The welcome message contains "Babamyrat"
    And The user navigates to "My Account" menu
    Then The user should be able to see  header as "Dashboard"

@wip1
  Scenario Outline: User Navigates Different Menu
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    And The user navigates to "<menu>" menu
    Then The user should be able to see  header as "<header>"

    Examples:
      | userType           | password   | name      | menu       | header                                  |
      | eurotech@gmail.com | Test12345! | Teacher   | Developers | Filter Profiles by Skill or by Location |
      | umut@gmail.com     | Test12345! | Admin      | All Posts  | Posts                                   |
      | berlin@gmail.com   | berlin     | Babamyrat | My Account | Dashboard                               |








