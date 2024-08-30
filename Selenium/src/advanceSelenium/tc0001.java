package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tc0001 extends BaseClass1 {

	String expectedData="Books";
	
	@Test
	public void ToCheckBooksPage()
	{
		driver.findElement(By.partialLinkText("Books")).click();
		//Reporter.log("Books page got opened successfully", true);
		String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		
		if(actualData.contains(expectedData))
		{
			Reporter.log("Navigated to Books page successfuly", true);
		}
		else {
			Reporter.log("Failed to Navigate to Books page", true);
		}
		//Assert.assertEquals(actualData,expectedData);
		//Reporter.log("Navigated to Books page successfuly", true);
		
	}

}
