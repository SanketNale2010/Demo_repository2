Feature: Register with Valid data

@sanity
Scenario: Successful Register with valid data

Given User Lunch The browser
And open URL "https://demo.nopcommerce.com/"
When User Click on Register
And User select the gender radio button
And User enter First Name as "Sagar" and Last name "Nale"
And User enter the Date of birth
And User enter the Email Id as "sanketnale2010@gmail.com"
And User enter the company name "Ola"
And User select the news letter check box
And User enter the passward as "Sanket@1998" and confirm passward as "Sanket@1998"
And click on Register button
Then User navigate to succsessfull registration page