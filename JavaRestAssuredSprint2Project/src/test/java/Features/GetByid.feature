Feature: User is able to fetch id of the data

Scenario: User wants to retrive the id data from database

When User is able to retrive the id  using an api is "http://localhost:8080/sales/2"
Then User should Validate The StatusCode is 200