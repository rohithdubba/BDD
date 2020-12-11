package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DealerSearchpageLocators 
{
@FindBy(how=How.XPATH,using="//select[@id='franchise']")
	public WebElement Makedropdown; 

@FindBy(how=How.XPATH,using="//select[@id='model']")
public WebElement modeldropdown;

@FindBy(how=How.XPATH,using="//select[@id='location']")
public WebElement Locationdropdown; 

@FindBy(how=How.XPATH,using="//input[@id='post_code']")
public WebElement postcode_text; 


@FindBy(how=How.XPATH,using="//input[@name='current_location']")
public WebElement Current_location_chkbx; 

@FindBy(how=How.XPATH,using="//input[@name='has_service']")
public WebElement Service_Centres_chkbx; 

@FindBy(how=How.XPATH,using="//input[@name='has_parts']")
public WebElement Parts_chkbx; 

@FindBy(how=How.XPATH,using="//input[@name='keyword'  and @id='keyword']")
public WebElement Keywords_field; 

@FindBy(how=How.XPATH,using="//a[@id='dealer-search-submit']")
public WebElement FindDealers_btn; 

@FindBy(how=How.XPATH,using="//a[contains(text(),'Reset filters')]")
public WebElement Reset_filter; 


}
