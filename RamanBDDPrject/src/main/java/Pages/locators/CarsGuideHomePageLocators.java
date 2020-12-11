package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

	@FindBy(how=How.LINK_TEXT,using="buy + sell")
	public WebElement buyselllink;
	
	
	@FindBy(how=How.LINK_TEXT,using="reviews")
	public WebElement reviewslink;
	
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement Searchcarlink;
	
	
	@FindBy(how=How.LINK_TEXT,using="Used")
	public WebElement Usedcarlink;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Find a Dealer')]")
	public WebElement Find_a_Dealer;
	
	
	
	
}
