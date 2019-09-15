Feature: Addition
Scenario: Valid entry
Given enter "2,2,+"
When click "Calculate"
Then Result should be 4

Scenario: Valid entry
Given enter "2,10,/"
When click "Calculate"
Then Result should be 5