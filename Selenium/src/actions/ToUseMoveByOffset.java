package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseMoveByOffset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		//to give time to manually click on login button if url not working
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("12345678");
		Actions action=new Actions(driver);
		action.moveByOffset(1180, 313).clickAndHold().perform();

	}

}
