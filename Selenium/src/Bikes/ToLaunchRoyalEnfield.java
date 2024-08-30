package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchRoyalEnfield {
	@Test(groups="smoke")
	public void royalEnfield()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.royalenfield.com/in");
		Reporter.log("RoyalEnfield launched", true);
		driver.quit();
	}

}
