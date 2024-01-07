Feature: Saatmann Search

User Story:  As a user, I want to use the search functionality on the Saatmann website,
             so that I can find relevant information

@smoke
    Scenario: Verify search functionality with a text
    Given I am on the Saatmann website
    Then I should see the "Suche" button on the page
    When I enter "Software-Tester" in the search input
    And I click the search button
    Then I should see relevant search results