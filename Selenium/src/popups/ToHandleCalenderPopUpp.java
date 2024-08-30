package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalenderPopUpp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.agoda.com/");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//img[@class='icon-close-circle']")).click();
		driver.findElement(By.id("check-out-box")).click();
		
		//To Handle Calendar popup
		for(;;)
		{
		try {
			driver.findElement(By.xpath("//div[text()='December 2024']/..//span[text()='19']")).click();
			break;
		}catch(Exception e)
		{
			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		}
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
