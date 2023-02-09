Feature: Demo Feature

Scenario: First Scenario
	Given I am on the demo page
	When I click on the AB Testing Link
	Then the AB Testing page will be displayed
	
	Scenario: Second Scenario
	Given I am on the demo page
	When I click on the Add and Remove Elements Link
	Then the Add and Remove Elements page will be displayed
	And the remove element button will be present
