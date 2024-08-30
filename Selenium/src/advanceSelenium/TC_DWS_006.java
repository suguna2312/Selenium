package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_006 extends BaseClass {
	//To add item to cart and verify the addToCart message
	String expectedData="Electronics";
	String expectedCellPhonedata="Cell phones";
	String expectedAddToCartMsg="The product has been added to your shopping cart";
	
	@Test
	public void toAddItemToCart() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
		if(actualData.contains(expectedData))
		{
			Reporter.log("Navigated successfully to Electronics page", true);
		}
		else
		{
			Reporter.log("Failed to navigate to Electronics page",true);
		}
		driver.findElement(By.partialLinkText("Cell phones")).click();
		String actualCellPhonedata = driver.findElement(By.xpath("//h1[text()='Cell phones']")).getText();
		if(actualCellPhonedata.equals(expectedCellPhonedata))
		{
			Reporter.log("Navigated successfully to CellPhone page", true);
		}
		else
		{
			Reporter.log("Failed to navigate to CellPhone page",true);
		}
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']")).click();
		String actualAddToCartMsg = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		Reporter.log(actualAddToCartMsg, true);
		if(actualAddToCartMsg.equals(expectedAddToCartMsg))
		{
			Reporter.log("CellPhone product added to cart successfully and message is displayed correctly", true);
		}
		else
		{
			Reporter.log("Failed to add CellPhone product to cart and hence message not displayed",true);
		}
		
		//Thread.sleep(2000);
	}

}
