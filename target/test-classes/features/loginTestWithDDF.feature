Feature: Data Driven Testing in Cucumber

  @ddf
  Scenario Outline: DDF Login Test
    Given The user is on the login page
    When The user enters "<Sheet Name>" and row number <Row Number>
    Then The welcome message contains excel <Name>

    And The user set data

    Examples:
      | Sheet Name | Row Number | Name |
      | Test Data  | 0          | 0    |
      | Test Data  | 1          | 1    |
      | Test Data  | 2          | 2    |
      | Test Data  | 3          | 3    |
      | Test Data  | 4          | 4    |
      | Test Data  | 5          | 5    |