package Step;

import Util.SeleniunDriver;
import cucumber.api.java.Before;

public class BeforeActions {

	
	@Before 
	
	public static void setup()
	{
		SeleniunDriver.setpdriver();
	}
}
