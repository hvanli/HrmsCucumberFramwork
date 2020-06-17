@testApiJune
Feature: Update Created Employee Info

  Background: 
    Given user generates token

  Scenario: Update Created Employee Info on Syntax API
    Given User creates request for updating created employee info on SyntaxApi
    When updateEmployee retrieves response
    Then Status Code is 201 for updateEmployee
    And User Validates that employee is updated successfully