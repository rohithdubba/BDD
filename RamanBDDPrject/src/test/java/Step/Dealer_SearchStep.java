package Step;

import java.util.List;

import org.testng.Assert;

import Pages.actions.CarsGuideHomePageActions;
import Util.SeleniunDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dealer_SearchStep {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	Pages.actions.DealerSearchPageActions DealerSearchPageActions = new Pages.actions.DealerSearchPageActions();
	
	

	
	
	@When("^I click on finddealer \"([^\"]*)\" link$")
	public void i_click_on_finddealer_link(String arg1) throws Throwable {
		carsGuideHomePageActions.FindadealerMenu();
	    
	}

	@And("^select brand \"([^\"]*)\" from Any make dropdown of dealer page$")
	public void select_brand_from_Any_make_dropdown_of_dealer_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DealerSearchPageActions.selectmake(arg1);
	}

	


@And("^select model \"([^\"]*)\" from Any model dropdown of dealer page$")
public void select_model_from_Any_model_dropdown_of_dealer_page(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	DealerSearchPageActions.selectmodel(arg1);
}
	
	
	@And("^select location \"([^\"]*)\" from Any location dropdown of dealer page$")
	public void select_location_from_Any_location_dropdown_of_dealer_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DealerSearchPageActions.selectlocation(arg1);
	}

	@And("^I click on find dealers$")
	public void i_click_on_find_dealers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DealerSearchPageActions.finddealer();
	}

	@And("^I should see the dealers$")
	public void i_should_see_the_dealers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^the dealer page title should match the expected title \"([^\"]*)\"$")
	public void the_dealer_page_title_should_match_the_expected_title(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String actual_title= SeleniunDriver.getdriver().getTitle();
	    Assert.assertEquals(actual_title, arg1);
	}

	
	
}
