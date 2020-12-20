Feature: Another language search
Scenario: Searching for ideas
Given I am on the main page
And I changed site's language to russian
When I click on Search button 
And I search for "Идея"
Then I see list of aricles that have word "Идея"