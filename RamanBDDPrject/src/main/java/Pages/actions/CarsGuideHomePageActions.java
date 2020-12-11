package Pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Pages.locators.CarsGuideHomePageLocators;
import Util.SeleniunDriver;

public class CarsGuideHomePageActions {

	
	CarsGuideHomePageLocators carsGuideHomePageLocators= null;
	
public CarsGuideHomePageActions()
{
//Once an object is created/intialized for carsguidehomepageactions class//
//pagefactory elements gets intiliazed,which are defined in carhomepagelocators//
	
	this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
	PageFactory.initElements(SeleniunDriver.getdriver(), carsGuideHomePageLocators);
}
	
//defining the methods present in carguide home page

public void MovetobuyplussellMenu()
{
	Actions a = new Actions(SeleniunDriver.getdriver());
	a.moveToElement(carsGuideHomePageLocators.buyselllink).perform();
}
	
public void ClickonSearchCarsMenu()
{
//prior to we click on searchcarmenu,we have to mouse over to buy sell menu	
	carsGuideHomePageLocators.Searchcarlink.click();
}	
	
public void ClickonUsedCarsMenu()
{
//prior to we click on searchcarmenu,we have to mouse over to buy sell menu		
	carsGuideHomePageLocators.Usedcarlink.click();
	
}	

public void FindadealerMenu()
{
//prior to we click on searchcarmenu,we have to mouse over to buy sell menu		
	carsGuideHomePageLocators.Find_a_Dealer.click();
	
}
		
public void MovetoreviewsMenu()
{
Actions a = new Actions(SeleniunDriver.getdriver());
a.moveToElement(carsGuideHomePageLocators.reviewslink).perform();
}
	
	
	
	
}
