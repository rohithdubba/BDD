package Step;

import org.testng.Assert;

import Util.SeleniunDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class UsedCarsStep 
{

	Pages.actions.UsedCarsSearchPageActions UsedCarsSearchPageActions = new Pages.actions.UsedCarsSearchPageActions();
	@When("^select used car brand \"([^\"]*)\" from Any make dropdown$")
	public void select_used_car_brand_from_Any_make_dropdown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UsedCarsSearchPageActions.selectcarmake(arg1);
	}

	@And("^select used car model \"([^\"]*)\" from Any model dropdown$")
	public void select_used_car_model_from_Any_model_dropdown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UsedCarsSearchPageActions.selectcarmodel(arg1);
	}

	@And("^select used car location \"([^\"]*)\" from Any location dropdown$")
	public void select_used_car_location_from_Any_location_dropdown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UsedCarsSearchPageActions.selectlocation(arg1);
	}

	@And("^select used car price \"([^\"]*)\" from Price dropdown$")
	public void select_used_car_price_from_Price_dropdown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UsedCarsSearchPageActions.selectcarprice(arg1);
	}

	@And("^I click on Find My next car button in used cars$")
	public void i_click_on_Find_My_next_car_button_in_used_cars() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UsedCarsSearchPageActions.FindMyNextCarButton();
	}

	@And("^I should see the searched used cars$")
	public void i_should_see_the_searched_used_cars() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@And("^the page title should match the expected title \"([^\"]*)\"$")
	public void the_page_title_should_batch_the_expected_title(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual_title=SeleniunDriver.getdriver().getTitle();
	    Assert.assertEquals(actual_title, arg1);
	}
	
	
}
