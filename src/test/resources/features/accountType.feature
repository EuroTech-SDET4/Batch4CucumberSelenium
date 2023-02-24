Feature: Account Types

  Scenario: Teacher User
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"

  Scenario: Student User
    Given The user is on the login page
    When The user logs in using "umut@gmail.com" and "Test12345!"
    Then The welcome message contains "umut"


  Scenario: Developer User
    Given The user is on the login page
    When The user logs in using "berlin@gmail.com" and "berlin"
    Then The welcome message contains "Babamyrat"

  Scenario: Developer User
    Given The user is on the login page
    When The user logs in using "harslan7579@gmail.com" and "Test12345!"




  Scenario Outline: Different User Type
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"

    Examples:
      | userType              | password   | name       |
      | eurotech@gmail.com    | Test12345! | Teacher    |
      | umut@gmail.com        | Test12345! | umut       |
      | harslan7579@gmail.com | 54321!     | Halil      |
      | berlin@gmail.com      | berlin     | Babamyrat  |
      | jackbauer@gmail.com   | Admin123   | Jack Bauer |


