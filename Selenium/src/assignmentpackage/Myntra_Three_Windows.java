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
import org.openqa.selenium.io.FileHandler;

public class Myntra_Three_Windows {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("watches",Keys.ENTER);
		
		String ParentId = driver.getWindowHandle();
		driver.findElement(By.xpath("(//h4[text()='Poze Women Analouge Watch'])[1]")).click();
		
		driver.findElement(By.xpath("(//p[text()='Poze Women Analouge Watch'])[1]")).click();
		Set<String> allWind = driver.getWindowHandles();
		allWind.remove(ParentId);
		for(String ids:allWind)
		{
			 String pageTitle = driver.switchTo().window(ids).getTitle();
			 if(pageTitle.contains("Buy Sonata Poze Women Textured Dial & Bracelet Style Straps Analogue Watch SP80004QM01  - Watches for Women 27172190 | Myntra"))
			 {
				 TakesScreenshot ts=(TakesScreenshot)driver;
					File temp = ts.getScreenshotAs(OutputType.FILE);
					File src=new File("./errorshots/FreeDelivery.png");
					FileHandler.copy(temp, src);
			 }
			 
		}
	}

}
