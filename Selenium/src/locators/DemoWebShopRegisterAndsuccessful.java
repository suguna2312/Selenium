package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegisterAndsuccessful {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("suguna");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("GM");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("sugu4567891@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("12345@suguu");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("12345@suguu");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
