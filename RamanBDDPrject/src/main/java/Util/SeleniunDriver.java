package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniunDriver {
	
private static SeleniunDriver seleniumdriver;	
private static WebDriver driver;

private static WebDriverWait waitdriver;
public final static int TIMEOUT= 30;
public final static int PAGE_LOAD_TIMEOUT =50;

private SeleniunDriver()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	waitdriver=new WebDriverWait(driver,TIMEOUT);
	driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);	
}

public static void openPage(String url)
{
	driver.get(url);
}

public static WebDriver getdriver() {
	
	return driver;
	
}

public static void setpdriver()
{
	if(seleniumdriver==null)
	{
		seleniumdriver=new SeleniunDriver();
			
	}
}
	
public static void teardown()
{
	if(driver!=null)
	{
		driver.close();
		driver.quit();
	}
	seleniumdriver=null;
}
	
	
	
	
	
	
	
	
}
