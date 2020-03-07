@apiZoom
Feature: Retrieve all employees from Syntax API

Background:
Given user generetes a token

Scenario:
When user calls getAllEmployee API
And getAllEmployees retrieves response
Then status code is 200 for getAllEmployees
And user validates all employees are retrieved