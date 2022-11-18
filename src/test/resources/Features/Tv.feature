#Author: your.email@your.domain.com
@tv
Feature: tv

Background:
   Given user login to flipkart

  Scenario: tv Purchase  
    When user search tv
    And user choose the tv
    And user doing payment by using UPI
    Then user receives confirmation message