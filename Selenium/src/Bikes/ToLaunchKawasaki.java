package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchKawasaki {
	@Test(groups="functional")
	public void kawasaki()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://kawasaki-india.com/");
		Reporter.log("Kawasaki launched", true);
		driver.quit();
	}

}
