package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {

	@FindBy(how=How.XPATH,using="//*[@id='makes']")
	public WebElement AnyMakedropdown;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='models']")
	public WebElement AnyModeldropdown;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='locations']")
	public WebElement Anylocationdropdown;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='priceTo']")
	public WebElement Pricedropdown;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='search-submit']")
	public WebElement Findmynextcarbutton;
	
	
	
	
}
