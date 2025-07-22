@testScenario
Feature: BookStore Flow

  Scenario: User need to verify for the Get All Books
    When Get All Books
    Then Validate that all books are listed

  Scenario: User need to verify for the Add new User
    When Add new User
    Then Validate that the new user is posted

  Scenario: User need to verify for the Generate Token
    When Generate Token
    Then Validate that the token is generated

  Scenario: User need to verify for the Authorize User
    When Authorize User
    Then Validate that the user is authorized

  Scenario: User need to verify for the Assign a new book to the user
    When Assign a new book to the user
    Then Validate that the book is assigned to the user

  Scenario: User need to verify for the Update the existing book
    When Update the existing book
    Then Validate that the book is updated

  Scenario: User need to verify for the Delete an existing book
    When Delete an existing book
    Then Validate that the book is removed