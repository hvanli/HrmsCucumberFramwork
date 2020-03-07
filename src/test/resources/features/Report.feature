@report
Feature: Report

  Background: 
    Given i am logged into HRMS
    And i navigated to the Reports Page

  @smoke
  Scenario Outline: 
    : Search for invalid report

    When i enter an invalid "<reportName>"
    And i click search button
    Then i see No Record Found message

    Examples: 
      | reportName   |
      | Kobe Bryant  |
      | LeBron James |

  @smoke
  Scenario Outline: Search for valid report
    When i enter an valid  "<reportName>"
    And i click search button
    Then i see the "<reportName>" report displayed

    Examples: 
      | reportName    |
      | Sample Report |
