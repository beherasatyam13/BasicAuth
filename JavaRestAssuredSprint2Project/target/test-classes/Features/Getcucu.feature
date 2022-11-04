Feature: Get feature


Scenario: User wants to get data from Database
Given User is able To Retrive the data in JSON Formate
When User is able to get the Data by using api is "http://localhost:8080/sales"
Then User should Validate The StatusCode as 200