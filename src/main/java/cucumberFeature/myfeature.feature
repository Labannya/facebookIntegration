Feature: Facebook
As facebook user
  I want to login to my facebook account

  Background:
    Given I have navigated to the facebook url

  @facebookIntegration
    Scenario:Invalid credentials
    When I enter invalid login credentials
    Then I should to get error message


  @facebookIntegration
  Scenario:Valid credentials
    When I enter valid login credentials
    Then I should to be logged in successfully





