
@login_facebook
Feature: login
  

  @tag1
  Scenario: successful Login with valid data 
    Given User navigate to homepage 
    When User enter the email ID 
    And User enter the password 
    Then User click on login button 
    
