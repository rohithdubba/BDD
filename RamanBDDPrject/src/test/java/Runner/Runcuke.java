package Runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;
import java.util.Date;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"json:target/negative/cucumber.json", "pretty", "html:target/negative/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = "C:\\Users\\user\\eclipse_oxy_workspace\\mounica workspace\\RamanBDDPrject\\src\\test\\resources\\Features",
        glue = "Step",
        tags = {"@Dealersearch"},
        dryRun=false   
        )

public class Runcuke extends AbstractTestNGCucumberTests {

	@BeforeClass
    public static void setup() {
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = "E:\\Extent_Reports\\report" + strDate+".html";
		File newFile = new File(fileName);
        //ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);

		ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("C:\\Users\\user\\eclipse_oxy_workspace\\mounica workspace\\RamanBDDPrject\\target\\Extent Reports"),false);
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

        // User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v87.0");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

        // Also you can add system information using a hash map
        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "v1.2.3");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);
	}
}
