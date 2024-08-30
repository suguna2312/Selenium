package assignmentpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ZomatoLogo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		File temp = driver.findElement(By.xpath("(//img[@role='presentation' and @class='high-res-image'])[2]")).getScreenshotAs(OutputType.FILE);
		File src=new File("./errorshots/Zomato.png");
		FileHandler.copy(temp, src);

	}

}
