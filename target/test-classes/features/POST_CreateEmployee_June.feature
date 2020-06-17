@testApiJune
Feature: Create Employee

  Background: 
    Given user generates token

  Scenario: Create an Employee on Syntax API
    Given User creates request for creating employee on SyntaxApi
    When createEmployee retrieves response
    Then Status Code is 201 for createEmployee
    And User Validates Employee Is Created
