package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_011 extends BaseClass{
	String expectedPageData="Checkout";
	
	String expectedTermsNcondMSG="Please accept the terms of service before the next step.";
	@Test
	public void navigateToCheckoutPage() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		String actualPageData = driver.findElement(By.xpath("//h1[text()='Checkout']")).getText();
		if(actualPageData.equals(expectedPageData))
		{
			Reporter.log("Successfully displayed checkout page", true);
		}
		else
		{
			Reporter.log("failed to display checkout page", true);
		}
	}


}
