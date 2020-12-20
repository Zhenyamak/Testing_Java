Feature: Search
Scenario: Searching for cucumber
Given I am on the main page
When I click on Search button
And I search for "Cucumber"
Then I see list of aricles that have word "cucumber"