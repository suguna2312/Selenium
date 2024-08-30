package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MytraLogoScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(4000);
		File temp = driver.findElement(By.xpath("//a[@data-reactid='16']")).getScreenshotAs(OutputType.FILE);
		File src=new File("./errorshots/Mntralogo.png");
		FileHandler.copy(temp, src);
		
	}

}
