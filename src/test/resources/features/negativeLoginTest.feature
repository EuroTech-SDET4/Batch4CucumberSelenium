Feature: Negative Login Test

  @Test
  Scenario Outline: Negative Test
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The warning message contains "<message>"

    Examples:
      | userType       | password   | message                                                               |
      | umut           | Test12345! | Please include an '@' in the email address. 'umut' is missing an '@'. |
      | umut@          | Test12345! | Please enter a part following '@'. 'umut@' is incomplete.             |
      | umut@gmail     | Test12345! | Please include a valid email!                                         |
      | umut@gmail.com | Test12345  | Invalid Credentials!                                                  |
