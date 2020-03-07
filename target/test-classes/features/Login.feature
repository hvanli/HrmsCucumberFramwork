@sprint1 @login
Feature: Login

  @smoke
  Scenario: Valid Login
    Given i enter valid username and valid password
    When i click login button
    Then i successfully logged in
    And i see welcome text

  @regression
  Scenario: Invalid Login
    Given i enter valid username and invalid password
    When i click login button
    Then i see -Invalid credentials-message

  @regression @smoke
  Scenario Outline: Invalid Login and message validation
  When I enter "<Username>" and "<Password>"
  And i click login button
  Then I see "<ErrorMessage>"
  
  Examples:
  | Username | Password   | ErrorMessage             |
  | Admin    | Admin123   | Invalid credentials      |
  | Admin    |            | Password cannot be empty |
  |          | Syntax@123 | Username cannot be empty |
  |          |            | Username cannot be empty |
  @regression @test
  Scenario: Invalid Login and message validation
    When I enter invalid username, password and I see Error Message
      | Username | Password   | ErrorMessage             |
      | Admin    | Admin123   | Invalid credentials      |
      | Admin    |            | Password cannot be empty |
      |          | Syntax@123 | Username cannot be empty |
      |          |            | Username cannot be empty |

  #@regression @test
  #Scenario: Invalid Login and message validation
    #When I enter invalid username and password
      #| Username | Password   |
      #| Admin    | Admin123   |
      #| Admin    |            |
      #|          | Syntax@123 |
      #|          |            |
    #And i click login button
    #Then I see the error message
      #| ErrorMessage             |
      #| Invalid credentials      |
      #| Password cannot be empty |
      #| Username cannot be empty |
      #| Username cannot be empty |
