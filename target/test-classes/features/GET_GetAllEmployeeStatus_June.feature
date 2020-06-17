@testApiJune
Feature: Get All Employee Status from Syntax API

  Background: 
    Given user generates token

  Scenario: Retrieve All Employee Status from Syntax API
    Given User creates request for getting all employee status from SyntaxApi
    When employeeStatus retrieves response
    Then Status Code is 200 for employeeStatus