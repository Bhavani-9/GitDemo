Feature: Login into application

Scenario Outline: Positive test validating login
Given Initialize browser with chrome
And navigate to "http://www.qaclickacademy.com/" site
And click on login button to land on signin page 
When user enters <username> and <password> and login
Then verify that user is successfully logged in or not
And close browsers

Examples:
|username                 |password   |
|bhavanibhisetti@gmail.com|Bhavani@9  |
|bhavanijodha@gmail.com   |1234567    |
