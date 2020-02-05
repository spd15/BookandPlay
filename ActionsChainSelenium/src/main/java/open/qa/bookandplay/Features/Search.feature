Feature : Search Page
Test Search Page Functionality

Scenario: Test Search Page
Given user is in home page of book and play
When user enter search text in search input field
Then auto suggestions show up
When user select one option from the suggestion
Then user is redirected to details page