package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureColorOfErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//To click on login link
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		//To click on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		//no need to store until needed so dnt call getTextmethod
		System.out.println( driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getCssValue("color"));
		

	}

}
