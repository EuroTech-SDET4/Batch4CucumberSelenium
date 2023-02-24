Feature: Dashboard Page Menu


  Scenario: User should be able to see Dashboard Menu After Log In
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    Then The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |

@smoke
  Scenario: Log in as a specific user
    Given The user is on the login page
    When The user logs in using following credentials
      | username | eurotech@gmail.com |
      | password | Test12345!         |
      | Message  | Teacher            |
    Then The user should be able to login
    Then The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |



