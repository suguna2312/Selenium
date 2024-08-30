package advanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass {
	String expectedData="Books";
	String expectedAddToCartMsg="The product has been added to your shopping cart";
	@Test
	public void toVerifyItemInShoppingCart() throws InterruptedException {
		driver.findElement(By.partialLinkText("Books")).click();
		//Reporter.log("Books page got opened successfully", true);
		String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		if(actualData.contains(expectedData))
		{
			Reporter.log("Navigated to Books page successfuly", true);
		}
		else {
			Reporter.log("Failed to Navigate to Books page", true);
		}
		
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")).click();
		String actualAddToCartMsg = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		Reporter.log(actualAddToCartMsg, true);
		if(actualAddToCartMsg.equals(expectedAddToCartMsg))
		{
			Reporter.log("Book product added to cart successfully and message is displayed correctly", true);
		}
		else
		{
			Reporter.log("Failed to add Book product to cart and hence message not displayed",true);
		}	

		WebElement shoppingCartEle = driver.findElement(By.xpath("//span[text()='Shopping cart' and @class='cart-label' ]"));
		//Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(shoppingCartEle).perform();
		
		List<WebElement> elements = driver.findElements(By.xpath("//table[@class='cart']/tbody/tr/td[3]"));
		
		String bookEle = driver.findElement(By.linkText("Computing and Internet")).getText();
		System.out.println(bookEle);
		boolean flag=false;
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
			if(ele.getText().contains(bookEle))
			{
				
				flag=true;
			}
			
			}
		
		if(flag==true){
			Reporter.log("Successfully added Book element to shopping cart",true);
		}else
		{
			Reporter.log("Failed to add Book element to shopping cart", true);
		}
		
		
	}
	

}
