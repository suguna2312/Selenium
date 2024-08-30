package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByContains {

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
		//To capture the error message and print
		//when the text is lengthy then we copy part of text and write Xpath n
		//check for 1on1 matching then only copy paste the script
		String err = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		System.out.println(err);
		driver.quit();
		
	}

}
