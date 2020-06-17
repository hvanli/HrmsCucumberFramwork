@testApiJune
Feature: Get All Job Titles from Syntax API

  Background: 
    Given user generates token

  Scenario: Retrieve All Job Titles from Syntax API
    Given User creates request for getting all job titles from SyntaxApi
    When jobTitle retrieves response
    Then Status Code is 200 for jobTitle