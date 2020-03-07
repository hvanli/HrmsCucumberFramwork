@apiTest1
Feature: Retrieving all employees from Syntax API

  Background: 
    Given user generates token

  Scenario: 
    Given user calls getAllEmployees API
    When getAllEmployees retrieves response
    Then status code is 200 for getAllEmployees
    Then user validates all employees retrieved
