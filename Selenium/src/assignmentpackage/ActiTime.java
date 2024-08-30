package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(4000);
		driver.findElement(By.id("FirstName")).sendKeys("suguna");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("GM");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("sugu2312@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("KPMG");
		

	}

}
