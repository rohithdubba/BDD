package Pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.locators.CarSearchPageLocators;
import Util.SeleniunDriver;

public class CarSearchPageActions {

	CarSearchPageLocators carSearchPageLocators =null;
	
	public  CarSearchPageActions()
	{
//whenever an object is created for CarSearchPageActions class,//
//pagefactory elements present in car serach page gets instantiated//

		this.carSearchPageLocators=new CarSearchPageLocators();
		PageFactory.initElements(SeleniunDriver.getdriver(), carSearchPageLocators);
	}
	
//defining the methods
	public void selectcarmake(String carbrand)
	{
		Select selectcarmake=new Select(carSearchPageLocators.AnyMakedropdown);
		selectcarmake.selectByVisibleText(carbrand);
	}
	
	public void selectcarmodel(String carmodel)
	{
		Select selectcarmake=new Select(carSearchPageLocators.AnyModeldropdown);
		selectcarmake.selectByVisibleText(carmodel);
	}
	
	public void selectlocation(String location)
	{
		Select selectcarmake=new Select(carSearchPageLocators.Anylocationdropdown);
		selectcarmake.selectByVisibleText(location);
	}
	
	public void selectcarprice(String carprice)
	{
		Select selectcarmake=new Select(carSearchPageLocators.Pricedropdown);
		selectcarmake.selectByVisibleText(carprice);
	}
	
	public void FindMyNextCarButton()
	{
		carSearchPageLocators.Findmynextcarbutton.click();
	}
	
}
