package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass{
	String expectedData="Computers";
	@Test
	public void ToCheckComputersPage()
	{
		driver.findElement(By.partialLinkText("Computers")).click();
		//Reporter.log("Computers page got opened successfully", true);
		String actualData = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		if(actualData.contains(expectedData))
		{
			Reporter.log("Navigated successfully to Computer page", true);
		}
		else
		{
			Reporter.log("Failed to navigate to Computer page",true);
		}
	}
}
