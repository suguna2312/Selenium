package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_008 extends BaseClass {
	@Test
	public void toSubscribeToNewsLetter()
	{
		driver.findElement(By.name("NewsletterEmail")).sendKeys("Testing@gmail.com");
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		boolean thankYouMsg = driver.findElement(By.xpath("//div[contains(text(),'Thank you for signing up! A verification email has been sent. We appreciate your interest.')]")).isDisplayed();
		if(thankYouMsg==true)
		{
			Reporter.log("signed up to Newsletter successfully and thankyou msg displayed", true);
		}
		else {
			Reporter.log("Failed to sign up for Newsletter", true);
		}
	}

}
