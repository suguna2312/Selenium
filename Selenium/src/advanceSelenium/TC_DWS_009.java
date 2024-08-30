package advanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_009 extends BaseClass{
	@Test
	public void toValidateGiftCards()
	{
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		driver.findElement(By.xpath("//a[text()='$5 Virtual Gift Card']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'$5 Virtual Gift Card')]/../..//input[@value='Add to cart']")).click();
		boolean giftCardErrMessage = driver.findElement(By.xpath("//p[text()='Enter valid recipient name']")).isDisplayed();
		if(giftCardErrMessage==true)
		{
			Reporter.log("Successfully displayed error message-Enter valid recipient name",true);
		}else
		{
			Reporter.log("Failed to display Error Message,although not entered recipient details",true);
		}
	
	
	}
	
}
