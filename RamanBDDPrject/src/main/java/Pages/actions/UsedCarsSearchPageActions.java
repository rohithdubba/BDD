package Pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Util.SeleniunDriver;

public class UsedCarsSearchPageActions {

Pages.locators.UsedCarSearchPageLocators UsedCarSearchPageLocators =null;

	public UsedCarsSearchPageActions()
	{
		
		this.UsedCarSearchPageLocators= new Pages.locators.UsedCarSearchPageLocators();
		
	PageFactory.initElements(SeleniunDriver.getdriver(),UsedCarSearchPageLocators);

	}
	

	public void selectcarmake(String carbrand)
	{
		Select selectcarmake=new Select(UsedCarSearchPageLocators.AnyMakedropdown);
		selectcarmake.selectByVisibleText(carbrand);
	}
	
	public void selectcarmodel(String carmodel)
	{
		Select selectcarmake=new Select(UsedCarSearchPageLocators.AnyModeldropdown);
		selectcarmake.selectByVisibleText(carmodel);
	}
	
	public void selectlocation(String location)
	{
		Select selectcarmake=new Select(UsedCarSearchPageLocators.Anylocationdropdown);
		selectcarmake.selectByVisibleText(location);
	}
	
	public void selectcarprice(String carprice)
	{
		Select selectcarmake=new Select(UsedCarSearchPageLocators.Pricedropdown);
		selectcarmake.selectByVisibleText(carprice);
	}
	
	public void FindMyNextCarButton()
	{
		UsedCarSearchPageLocators.usedcar_search.click();
	}
	
	
}
	

