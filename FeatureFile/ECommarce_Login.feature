Feature: Login with Valid Credentials

@sanity @regression
  Scenario: Successfull Login with Valid Credentials
    Given User Launch the browser
    And Open URL "https://demo.nopcommerce.com/"
    When User click on Login button
    And User enters Email as "sanketnale2010@gmail.com" and Password as "Sanket@1998"
    And User is click on Remember passward check box
    And Click on Login button
    Then User navigates to MyAccount Page
