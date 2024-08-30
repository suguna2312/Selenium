package advanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass {
	
	//To add few elements to cart and delete data from cart and verify,if it is removed successfully
	@Test
	public void toDeleteItem() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		driver.findElement(By.xpath("//span[text()='10.00']/../..//input[@value='Add to cart']")).click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//table[@class='cart']/tbody/tr/td[3]"));
		String CellPhoneEle = driver.findElement(By.linkText("Smartphone")).getText();
		//other way to write //table[@class='cart']//tr/child::td[3]
		for(WebElement ele:elements)
		{
			Reporter.log(ele.getText(), true);
		}
		driver.findElement(By.xpath("(//a[text()='Smartphone'])[2]/../..//input[@type='checkbox']")).click();
		//driver.findElement(By.xpath("(//a[text()='Smartphone'])[2]/../..//input[@name='removefromcart']")).click();
		driver.findElement(By.name("updatecart")).click();
		
		
		if(elements.contains(CellPhoneEle))
		{
			Reporter.log("Failed To delete element",true);
		}
		else
		{
			Reporter.log("Element is deleted successfully", true);
		}
	}

}
