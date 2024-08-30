package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass {
	//To Verify if addToCart message displayed or not
	String expectedData="Electronics";
	String expectedCellPhonedata="Cell phones";
	
	
	@Test
	public void toCheckAddToCartMsgDisplayed() throws InterruptedException
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
		  boolean actualAddToCartMsg = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).isDisplayed();
		//Reporter.log(actualAddToCartMsg.isDisplayed(), true);(boolean,boolean) not allowed??
		  if(actualAddToCartMsg==true)
		  {
			  Reporter.log("AddToCart message is displayed after adding item to cart", true);
		  }else {
			  Reporter.log("Failed to display AddToCart message", true);
		  }
		
	}



}
