Feature: Data Driven Testing in Cucumber

  @ddf
  Scenario Outline: DDF Login Test
    Given The user is on the login page
    When The user enters "<Sheet Name>" and row number <Row Number>
    Then The welcome message contains in excel <Row Number For Name>
    Then The user verify that company name <Row Number For Company>

    Examples:
      | Sheet Name | Row Number | Row Number For Name | Row Number For Company |
      | Test Data  | 0          | 0                   | 0                      |
      | Test Data  | 1          | 1                   | 1                      |
      | Test Data  | 2          | 2                   | 2                      |
      | Test Data  | 3          | 3                   | 3                      |
      | Test Data  | 4          | 4                   | 4                      |
      | Test Data  | 5          | 5                   | 5                      |
      | Test Data  | 6          | 6                   | 6                      |
      | Test Data  | 7          | 7                   | 7                      |
      | Test Data  | 8          | 8                   | 8                      |

