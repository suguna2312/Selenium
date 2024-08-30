package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import advanceSelenium.BaseClass;

public class ToValidateCSSvalue extends BaseClass {
	@Test
	public void toGetGiftCardsCSSvalue()
	{
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		driver.findElement(By.xpath("//a[text()='$5 Virtual Gift Card']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'$5 Virtual Gift Card')]/../..//input[@value='Add to cart']")).click();
		 WebElement giftCardErrMessage = driver.findElement(By.xpath("//p[text()='Enter valid recipient name']"));
		 
		 Reporter.log(giftCardErrMessage.getCssValue("background"),true);
	
	
	}

}
