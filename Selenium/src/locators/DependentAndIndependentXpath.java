package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentAndIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.shoppersstack.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='ROADSTER']/../..//button[@id='addToCart']")).click();
		*/
		//driver.get("https://www.bigbasket.com/");
		//driver.findElement(By.xpath("//h3[text()='Coriander Leaves']/../../../..//button[text()='Add']")).click();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches for women");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Fossil'])[5]/../../../..//input[@type='checkbox']")).click();
	
	}

}
