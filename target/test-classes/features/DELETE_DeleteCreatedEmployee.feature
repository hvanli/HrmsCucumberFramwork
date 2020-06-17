@testApiJune
Feature: Delete Employee

  Background: 
    Given user generates token

  Scenario: Delete Created Employee
    Given User creates request for deleting created employee from SyntaxApi
    When deleteEmployee retrieves response
    Then Status Code is 201 for deleteEmployee
    And User Validates that Employee is Deleted Successfully