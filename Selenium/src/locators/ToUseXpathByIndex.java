package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		

			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.dunzo.com/bangalore");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[text()='Search']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("apple");
			driver.findElement(By.xpath("(//p[text()='Apple - Washington'])[2]/../..//button[text()='ADD']")).click();
			//(//p[text()='Onion'])[5]
			//p[text()='Apple - Royal Gala'])[2]
		//	driver.findElement(by)

	}

}
