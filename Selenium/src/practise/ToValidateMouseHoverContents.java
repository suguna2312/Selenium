package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import advanceSelenium.BaseClass;

public class ToValidateMouseHoverContents extends BaseClass {
	@Test
	public void ToCheckComputersPage()
	{
		
		//WebElement computersEle = driver.findElement(By.partialLinkText("Computers"));
		//[//div[@class='header-menu']//li]
		//String titleOFEle = computersEle.getText();
		WebElement electronicsEle = driver.findElement(By.partialLinkText("Electronics"));
		//Reporter.log(titleOFEle, true);
		Actions action=new Actions(driver);
		//action.moveToElement(computersEle).perform();
		action.moveToElement(electronicsEle).perform();
		//String test = driver.findElement(By.partialLinkText("Computers")).getAttribute("title");
		//Reporter.log(test, true);
		
	}

}
