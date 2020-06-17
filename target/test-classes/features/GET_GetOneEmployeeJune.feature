@testApiJune
Feature: GetAllEmployees from Syntax API

  Background: 
    Given user generates token

  Scenario: Retrive One Employee from Syntax API
    Given User creates request for retrieving one employee
    When getOneEmployee retrieves response
    Then Status Code is 200 for getOneEmployee
    And User asserts given employee is retrieved
    
   