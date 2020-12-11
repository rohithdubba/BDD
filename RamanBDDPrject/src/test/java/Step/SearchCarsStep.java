package Step;

import java.util.List;

import org.testng.Assert;

import Pages.actions.CarSearchPageActions;
import Pages.actions.CarsGuideHomePageActions;
import Util.SeleniunDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarsStep {
	
	CarsGuideHomePageActions carsGuideHomePageActions= new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();
	
	@Given("^Iam on the home page \"([^\"]*)\"$")
	public void iam_on_the_home_page(String websiteurl) throws Throwable {
		SeleniunDriver.openPage(websiteurl);
	}

	@When("^I move to menu$")
	public void i_move_to_menu(List<String>list) throws Throwable {
	  String menu  =list.get(1);
	  System.out.println("the menu is" + menu);
	  carsGuideHomePageActions.MovetobuyplussellMenu();;
		
	}
	@And("^I click on used_car \"([^\"]*)\" link$")
	public void i_click_on_used_car_link(String usedcars) throws Throwable {
		carsGuideHomePageActions.ClickonUsedCarsMenu();
	  
	}
	@And("^I click on \"([^\"]*)\" link$")
	public void i_click_on_link(String searchCars) throws Throwable {
		carsGuideHomePageActions.ClickonSearchCarsMenu();
	}

	@And("^select car brand \"([^\"]*)\" from Any make dropdown$")
	public void select_car_brand_from_Any_make_dropdown(String carbrand) throws Throwable {
		carSearchPageActions.selectcarmake(carbrand);
	}

	@And("^select car model \"([^\"]*)\" from Any model dropdown$")
	public void select_car_model_from_Any_model_dropdown(String carmodel) throws Throwable {
		carSearchPageActions.selectcarmodel(carmodel);
	}

	@And("^select location \"([^\"]*)\" from Any location dropdown$")
	public void select_location_from_Any_location_dropdown(String location) throws Throwable {
		carSearchPageActions.selectlocation(location);
	}

	@And("^select price \"([^\"]*)\" from Price dropdown$")
	public void select_price_from_Price_dropdown(String carprice) throws Throwable {
		carSearchPageActions.selectcarprice(carprice);
	}

	@And("^I click on Find My next car button$")
	public void i_click_on_Find_My_next_car_button() throws Throwable {
		carSearchPageActions.FindMyNextCarButton();
	}

	@Then("^I should see the searched cars$")
	public void i_should_see_the_searched_cars() throws Throwable {
	    
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String Expected) throws Throwable {
	    String actual_title=SeleniunDriver.getdriver().getTitle();
	    Assert.assertEquals(actual_title, Expected);
	}


}
