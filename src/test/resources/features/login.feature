@login
Feature: Eurotech Log in Test

  Background:
    Given The user is on the login page

  @Teacher
  Scenario: Login as a teacher

    When  The user enters teacher credentials
    Then  The user should be able to login

  @Student
  Scenario: Login as a student

    When The user enters student credentials
    Then The user should be able to login

  @db
  Scenario: Login as developer

    When The user enters developer credentials
    Then The user should be able to login




