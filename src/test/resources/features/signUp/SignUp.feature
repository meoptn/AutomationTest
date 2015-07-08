Feature: Register an account
  In order to register an account guru99
  As an user
  I want to register an account successfully

  Scenario: Register an account
    Given I go to home page
    When I input valid data
      | Field            | Value            |
      | First name       | Mai              |
      | Last name        | PTN              |
      | Email Address    | maimeo3@gmail.com |
      | Password         | 12345678         |
      | Confirm password | 12345678         |
    And I click on register button
    Then I want to see text "WELCOME, MAI PTN!"
