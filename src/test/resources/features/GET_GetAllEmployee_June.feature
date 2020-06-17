@testApiJune
Feature: GetAllEmployees from Syntax API

  Background: 
    Given user generates token

  Scenario: Retrieve All Employees from Syntax API
    Given User creates request for SyntaxApi
    When getAllEmployees retrieves response
    Then Status Code is 200 for getAllEmployees
   