#@sprint3 @candidates
#Feature: Candidates
#
  #Background: 
    #Given i am logged into HRMS
    #And i navigate to Candidates Page
#
  #@smoke
  #Scenario Outline: Searching a candidate by name
    #When i enter "<CandidateName>"
    #And i click search button in Candidate
    #Then i see candidate name in search results
#
    #Examples: 
      #| CandidateName |
      #| Satish Jha    |
      #| Dan Cons      |
      #| Dan Em Cons   |
#
  #@regression
  #Scenario Outline: Adding new Candidates to Candidates Page
    #When i click Add button
    #And i enter "<FirstName>", "<LastName>", "<Email>" and "<ContactNo>"
    #And i select "<JobVacancy>"
    #And i select  "<Date>" of Application
    #And i click Save button
    #Then i see Candidate is added successfully
#
    #Examples: 
      #| FirstName | LastName | Email            | ContactNo  | JobVacancy | Date       |
      #| Lionel    | Messi    | lionel@messi.com | 1112223344 | Tester     | 2020-01-30 |
      #| Russel    | Crowl    | russel@crowl.com | 2223334455 | Tester     | 2020-01-14 |
#
  #@hasan
  #Scenario Outline: Deleting Candidates from the Candidates list
    #When i find "<CandidateName>" from the list
    #And i click select button
    #And i click Delete button
    #And i confirm delete
    #Then i see given Candidate is deleted from Candidate List
    #Examples:
      #| CandidateName |
      #| Lionel Messi  |
      #| Russel Crowl  |
