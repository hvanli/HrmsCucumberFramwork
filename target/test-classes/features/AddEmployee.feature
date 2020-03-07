@sprint2 @addEmployee
Feature: Add Employee

  Background: 
    Given i am logged into HRMS
    And i navigated to Add Employee Page

  @smoke
  Scenario: Add Employee To HRMS
  When i add firstName, middleName and last name
  And i click Create Login Details
  And i enter username-password-confirm password
  And i click Save button
  Then i will see Personal Details
  
  @smoke
  Scenario: Add New Employee To HRMS
  When i add "John", "S" and "Smith"
  And i click Save button
  Then i will see Personal Details
  
  #@regression
  #Scenario Outline: Add New Employee
  #When i add "<FirstName>", "<MiddleName>" and "<LastName>"
  #And i click Save button
  #Then i see Employee with "<FirstName>", "<MiddleName>" and "<LastName>" is displayed
  #
  #Examples:
  #| FirstName | MiddleName | LastName |
  #| James     | Russel     | Candy    |
  #| John      |            | Smith    |
  #| Sasha     | J          | Brown    |
  #| Kobe      | K          | Bryant   |
  #
  #@regression
  #Scenario: Add Employee without employee id
  #When i add firstName, middleName and last name
  #And i delete employee id
  #And i click Save button
  #Then i see employee without employee id is being added
  #
  #@regression
  #Scenario: Add Employee negative scenario
  #When i click Save button
  #Then i see required error message next to the first and last name
  #
  @smoke
  Scenario: Add new Employee and Edit Details
    When i enter user info and edit Personal details I see Successfully Saved
      | FirstName | MiddleName | LastName | DLNum    | LicExpYear | LicExpMonth | LicExpDay | SSNNumber    | Gender | MaritalStatus | Nationality | DoB        |
      | Michael   | Mors       | OneLee   | TX123456 |       2022 | Dec         |        27 | 123-456-4578 | Male   | Married       | Turkish     | 1981-01-21 |
