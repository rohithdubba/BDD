package Step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Util.SeleniunDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {

	@After
	
	public static void Teardown(Scenario s)
	{
		WebDriver driver=SeleniunDriver.getdriver();
		if(s.isFailed())
		{
			
			byte[] src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(src, "img/png");
		}
		SeleniunDriver.teardown();
	}
}
