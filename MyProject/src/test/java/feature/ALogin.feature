Feature: Hotel Booking Automation
  

Scenario Outline: SignIn Page check
    Given User landing on the hotel sign in page
    When User enters the username "AbanAbu1410" and password "Aban@1410"
    And User clicking on the login button
    Then Hotel search page should appear

  
 #  @multipleValues
 #  Scenario Outline: SignIn Page check
   
    #Given User landing on the hotel sign in page
    #When User enters the username "<username>" and password "<password>"
   # And User clicking on the login button
   # Then Hotel search page should appear 
    
#  Examples:

 # |username|password|
  #| AbuAban1410|Aban@1410|
 # |BakeerathiBabu|BakeerathiBabu|

