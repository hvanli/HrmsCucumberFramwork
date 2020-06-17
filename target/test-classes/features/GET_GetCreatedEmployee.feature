@testApiJune
Feature: GetCreatedEmployee

  Background: 
    Given user generates token

  Scenario: Retrieve Created  Employee from Syntax API
    Given User creates request for retieving created employee from SyntaxApi
    When getOneEmployee retrieves response for created Employee
    Then Status Code is 200 for created getOneEmployee
