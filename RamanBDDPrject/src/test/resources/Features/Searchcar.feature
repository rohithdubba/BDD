@Search-Cars
Feature: Validating search cars functionality 

@Search-Cars-Positive 
Scenario: validate cars searches pages 
	Given Iam on the home page "https://www.carsguide.com.au/" 
	When I move to menu 
		| menu|
		|buy+sell|
		|reviews|
	And I click on "search cars" link 
	And select car brand "BMW" from Any make dropdown 
	And select car model "1 Series" from Any model dropdown 
	And select location "ACT - All" from Any location dropdown 
	And select price "$200,000" from Price dropdown 
	And I click on Find My next car button 
	Then I should see the searched cars 
	And the page title should be "Bmw 1 Series Under 200000 for Sale ACT | carsguide"
