package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_013 extends BaseClass{
			String expectedOrderInfoPage="Order information";
			String expectedOrderConfirmationMSG="Your order has been successfully processed!";
	
	//String expectedTermsNcondMSG="Please accept the terms of service before the next step.";
	@Test
	public void navigateToOrderInfoPage() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue' and @title='Continue' and @onclick='Billing.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		String actualOrderConfirmationMSG = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']")).getText();
		if(actualOrderConfirmationMSG.equals(expectedOrderConfirmationMSG))
		{
			Reporter.log("Successfully placed order", true);
		}
		else
		{
			Reporter.log("failed to place order", true);
		}
		
		driver.findElement(By.linkText("Click here for order details.")).click();
		String actualOrderInfoPage = driver.findElement(By.xpath("//h1[text()='Order information']")).getText();
		if(actualOrderInfoPage.equals(expectedOrderInfoPage))
		{
			Reporter.log("Successfully displayed order information", true);
		}
		else
		{
			Reporter.log("failed to displayed order information", true);
		}	
		
	
	
	
	}



}


