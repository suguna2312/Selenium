package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		//To Switch driver control using index
		driver.switchTo().frame(0);//switch to another webpage
		
		//To switch driver control using id or name
		//driver.switchTo().frame("send-sms-iframe");
		
		//To select driver control using webelement
		/*WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);*/
		driver.findElement(By.id("regEmail")).sendKeys("9611223344");
		
		//To switch back
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
