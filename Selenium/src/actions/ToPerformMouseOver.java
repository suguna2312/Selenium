package actions;

import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseOver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		//WebElement electronicele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions action=new Actions(driver);
		//action.moveToElement(electronicele).perform();
		action.moveToElement(login).perform();
	//	driver.findElement(By.linkText("Electronics GST Store")).click();
		Thread.sleep(6000);
		driver.quit();
		
	}

}
