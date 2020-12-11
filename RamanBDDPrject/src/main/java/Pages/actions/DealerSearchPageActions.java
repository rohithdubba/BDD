package Pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Util.SeleniunDriver;

public class DealerSearchPageActions {

	
	Pages.locators.DealerSearchpageLocators DealerSearchpageLocators = null;
	
	public DealerSearchPageActions()
	{
		this.DealerSearchpageLocators=new Pages.locators.DealerSearchpageLocators();
		PageFactory.initElements(SeleniunDriver.getdriver(), this.DealerSearchpageLocators);
	}


public void selectmake(String make)
{
	Select sel= new Select(DealerSearchpageLocators.Makedropdown);
	sel.selectByVisibleText(make);
}

public void selectlocation(String location)
{
	Select sel= new Select(DealerSearchpageLocators.Locationdropdown);
	sel.selectByVisibleText(location);
}
public void selectmodel(String model)
{
	Select sel= new Select(DealerSearchpageLocators.modeldropdown);
	sel.selectByVisibleText(model);
}

public void postcode(String postcode)
{
	DealerSearchpageLocators.postcode_text.sendKeys(postcode);
}

public void current_Location()
{
	DealerSearchpageLocators.Current_location_chkbx.click();
}

public void service_centres_selection()
{
	DealerSearchpageLocators.Service_Centres_chkbx.click();
}

public void parts_selection()
{
	DealerSearchpageLocators.Service_Centres_chkbx.click();
}


public void keywords(String key)
{
	DealerSearchpageLocators.Keywords_field.sendKeys(key);
}

public void finddealer()
{
	DealerSearchpageLocators.FindDealers_btn.click();
}

public void Reset_filter()
{
	DealerSearchpageLocators.Reset_filter.click();
}

}
