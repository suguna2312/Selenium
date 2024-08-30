package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdLocators {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("Test@2312");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("1234sf");
		Thread.sleep(2000);
		
		//driver.findElement(By.name("login")).click();
	}

}
