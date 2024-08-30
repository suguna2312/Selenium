package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		//Thread.sleep(2000);
		for(;;)
		{
			try
			{
				driver.findElement(By.id("loginclose1")).click();
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(3000);
			}
		}
		driver.findElement(By.linkText("Sofas")).click();
		Thread.sleep(000);
		 //driver.findElement(By.xpath("//p[text()='Fabric Sofas' and @class='category-name']")).click();
		driver.findElement(By.partialLinkText("Fabric Sofas")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[contains(text(),'Sibert 3 Seater Fabric Sofa (Mulberry Pink)')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("button-cart-buy-now")).click();
		// driver.findElement(By.partialLinkText("Add to Cart")).click();
		 driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Living")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Coffee Tables")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//h3[contains(text(),'Dojo Coffee')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Decor")).click();
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("(//img[@alt='Flower Pot & Vase home decoration items'])[2]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//h3[contains(text(),'Lea Dried Floral Arrangement Vase (Yellow, S)')]")).click();
		 driver.findElement(By.partialLinkText("Figurines")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//h3[text()='Timeless Deer Charms Alloy Figurine (Gold, S)']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Cart")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@title='Dojo Coffee Table with Toughened Glass Top']/..//p[@title='Remove']")).click();
		 
		 
	}

}
