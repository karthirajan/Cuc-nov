#Author: your.email@your.domain.com
Feature: Mobile

Background:
   Given user login to flipkart

  Scenario: Mobile Purchase  
    When user search mobile
    And user choose the mobile
    And user doing payment by using UPI
    Then user receives confirmation message
    
 @1d @mobile   
  Scenario: Mobile Purchase by one dim
    When user search mobile by using oneD list
    |realme|iPhone|SAMSUNG|
    And user choose the mobile
    And user doing payment by using UPI
    Then user receives confirmation message
    
    @1d
  Scenario: Mobile Purchase by one dim
    When user search mobile by using oneD map
    |phone1|realme|
    |phone2|iPhone|
    |phone3|SAMSUNG|
    And user choose the mobile
    And user doing payment by using UPI
    Then user receives confirmation message
    
  Scenario Outline: Mobile Purchase
    When user search mobile "<phone>"
    And user choose the mobile
    And user doing payment by using UPI
    Then user receives confirmation message
    
    Examples:
    |phone|spec|
    |realme|8|
    |iPhone|9|
    |SAMSUNG|10|