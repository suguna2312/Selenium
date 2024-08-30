package practise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Iphone_Trail {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in/");
		String ParentId = driver.getWindowHandle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[1]")).click();
		//driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 15 (128 GB) - Black')])[2]")).click();
		//driver.findElement(By.linkText("FREE delivery")).click();
		driver.findElement(By.xpath("//span[text()='Saturday, 3 August']/..//a[text()='Details']")).click();
		
		//System.out.println(ParentId);
		Set<String> allWind = driver.getWindowHandles();
		allWind.remove(ParentId);
		for(String ids:allWind)
		{
			 String pageTitle = driver.switchTo().window(ids).getTitle();
			 if(pageTitle.contains("Shipping Speeds and Charges - Amazon Customer Service"))
			 {
				 TakesScreenshot ts=(TakesScreenshot)driver;
					File temp = ts.getScreenshotAs(OutputType.FILE);
					File src=new File("./errorshots/FreeDelivery.png");
					FileHandler.copy(temp, src);
			 }
			 
		}
		//allWind.remove(ParentId);
		
			
		//driver.quit();	
			//driver.findElement(By.xpath("(//a[text()='Details'])[1]")).click();
			//TakesScreenshot ts=(TakesScreenshot)driver;
			//File temp = ts.getScreenshotAs(OutputType.FILE);
			//File src=new File("./errorshots/details.png");
			//FileHandler.copy(temp, src);
			
		

	}
}
