package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshotOfEntireWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
		//To Take Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//File src=new File("./errorshots/Amazon.jpeg");
		// String temp = ts.getScreenshotAs(OutputType.BASE64);
		File src=new File("./screenshots/Amazon1.png");
		//File src=new File("./org/errorshots/Amazon.png");
		FileHandler.copy(temp, src);
		
	}

}
