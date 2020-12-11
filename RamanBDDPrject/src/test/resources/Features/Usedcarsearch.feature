@SearchUsed-Cars
Feature: Validating search used cars functionality 

@Search-UsedCars-Positive 
Scenario: validate car search page 
	Given Iam on the home page "https://www.carsguide.com.au/" 
	When I move to menu 
		| menu|
		|buy+sell|
		|reviews|
		And I click on used_car "Used" link 
	And select used car brand "Audi" from Any make dropdown 
	And select used car model "A4" from Any model dropdown 
	And select used car location "ACT - All" from Any location dropdown 
	And select used car price "$45,000" from Price dropdown 
	And I click on Find My next car button in used cars
	Then I should see the searched used cars 
	And the page title should match the expected title "Used Audi A4 Under 45000 for Sale ACT | carsguide"