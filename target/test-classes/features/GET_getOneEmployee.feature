@getOneEmployee
Feature: GetOneEmployee from Syntax API

  Background: 
    Given user generates token

  Scenario: 
    Given user calls getOneEmployee API with empId 3394
    When getOneEmployee retrieves response
    Then status code is 200 for getOneEmployee
    Then user validates all employees retrieved
