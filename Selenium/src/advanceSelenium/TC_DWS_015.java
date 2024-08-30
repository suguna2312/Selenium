package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_015 extends BaseClass {
	String expectedTermsNcondMSG="Please accept the terms of service before the next step.";
	@Test
	public void termsAndCondtionsMsg() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.id("checkout")).click();
		String actualTermsNcondMSG = driver.findElement(By.xpath("//p[contains(text(),'Please accept the terms of service before the next step.')]")).getText();
		if(actualTermsNcondMSG.equals(expectedTermsNcondMSG))
		{
			Reporter.log("Successfully Terms and Condition message displayed", true);
		}
		else
		{
			Reporter.log("failed to display Terms and Condition message", true);
		}
	}

}
