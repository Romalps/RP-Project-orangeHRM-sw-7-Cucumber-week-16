Feature: Login Test
  As a user I want to Login on OrangeHRM website
  @sanity
  Scenario: Verify user should Login successfully
    Given I am on homepage
    When enter Username
    And  Enter password
    And Click on Login Button
    Then Verify dashboard text is displayed "Dashboard"

  @smoke
    Scenario: Verify that the Logo display on homepage
      Given I am on homepage
      When enter Username
      And Enter password
      And Click on Login Button
      Then Verify Logo is displayed
  @regression
    Scenario: Verify user should Logout successfully
      Given I am on homepage
      When enter Username
      And Enter password
      And Click on Login Button
      And click on User Profile logo
      And Mouse hover on Logout and click
      Then Verify the Login panel text "Login" is displayed