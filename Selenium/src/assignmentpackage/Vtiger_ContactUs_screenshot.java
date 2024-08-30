package assignmentpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Vtiger_ContactUs_screenshot {

	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.vtiger.com/");
	WebElement company = driver.findElement(By.partialLinkText("Company"));
	Actions action=new Actions(driver);
	action.moveToElement(company).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	File temp=driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]")).getScreenshotAs(OutputType.FILE);
	File src=new File("./errorshots/Bangalore.png");
	FileHandler.copy(temp, src);
	//String bangaloreTelephone = driver.findElement(By.xpath("//p[contains(text(),'+91 9243602352')]")).getText();
	//System.out.println(bangaloreTelephone);
	
	}

}
