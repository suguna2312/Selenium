package assignmentpackage;

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

public class IphoneAmazon {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'iPhone 15')])[1]")).click();
		//driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 15 (128 GB) - Black')])[2]")).click();
		String ParentId = driver.getWindowHandle();
		System.out.println("ParentId"+ParentId);
		Set<String> allWind = driver.getWindowHandles();
		
		allWind.remove(ParentId);
		/*for(String ids:allWind)
		{
			System.out.println("Allid"+ids);
		}*/
		for(String id:allWind)
			 {
			  
				    driver.switchTo().window(id);
				    
			 }
		//(where ever the driver control is present ,getWindowHandle will give the id of that webpage not always parentWindow)
		//String testID = driver.getWindowHandle();
		//System.out.println("testID"+testID);
			
		//To Scroll down the page (Optional)
	    Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		//To capture Screenshot of iphone
	 	TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src=new File("./screenshots/AmazonIphone_practise2.png");
		FileHandler.copy(temp, src);
		driver.quit();	
				
		

	}

}
