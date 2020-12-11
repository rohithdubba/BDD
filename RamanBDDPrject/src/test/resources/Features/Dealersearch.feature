@Dealersearch
Feature: Validating dealer search functionality

Scenario Outline: validate dealer search page
Given Iam on the home page "https://www.carsguide.com.au/" 
	When I move to menu 
		| menu|
		|buy+sell|
		|reviews|
		And I click on finddealer "Find a Dealer" link 
    And select brand "<make>" from Any make dropdown of dealer page
	And select model "<model>" from Any model dropdown of dealer page
	And select location "<location>" from Any location dropdown of dealer page
	And I click on find dealers
	Then I should see the dealers
	And the dealer page title should match the expected title "<title>"

Examples:
| make |  model  | location |title|
| AUDI | Q7      | ACT - All |AUDI Q7 Dealers ACT \| carsguide|
| BMW | 3 SERIES | ACT - All |BMW 3 SERIES Dealers ACT \| carsguide|