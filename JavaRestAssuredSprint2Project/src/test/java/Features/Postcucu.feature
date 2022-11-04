Feature: User is able to put the data in the database

Scenario: user wants to post the data 
Given user is able to provide te data in json formate
When user gives the data by using an api is "http://localhost:8080/sales"
Then user validates the status code is 200 