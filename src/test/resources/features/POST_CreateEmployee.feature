#@apiTest
Feature: Validating Syntax HRMS API's

  Background: 
    Given user generates token

  Scenario: This test will check to see if an Emloyee is created
    Given user calls createEmployee API
    When create retrieves response
    Then status code is 200
    Then user validates employee is created
