package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("iframeResult");
		WebElement tryIt = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(tryIt);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Optional step
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();

	}

}
