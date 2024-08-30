package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchAccess125 {

	@Test(groups="smoke")
	public void access125()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/all-new-access-125-bluetooth-enabled");
		Reporter.log("Access125 launched", true);
		driver.quit();
	}


}
