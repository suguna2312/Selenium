package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchBMW {
	@Test(groups="functional")
	public void bmw()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.bmw.com/en/index.html");
		Reporter.log("BMW launched", true);
		driver.quit();
	}



}
