package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchHarleyDavidson {
	@Test(groups="system")
	public void harleyDavidson()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		Reporter.log("HarleyDavidson launched", true);
		driver.quit();
	}


	
	
}
