Feature: Testing the login functionality

  Background:
    Given Launch the driver
    When user will enter the user id
    When user will enter the password
    When user will click on Go button
    When user will click on notification allowed

  Scenario: User logs in with userid password
    Given Launch the driver
    When user will enter the user id
    When user will enter the password
    When user will click on Go button
    When user will click on notification allowed
    When Schedule page buttton clicked
