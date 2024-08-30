package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickandHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.get("https://yonobusiness.sbi/");
		Thread.sleep(4000);
		
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.xpath("(//a[@type='button'])[1]")).click();
		//driver.findElement(By.xpath("//a[@class='btn yn-btn btn-yono-homepage login-btn' and @type='button']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("password")).sendKeys("12345678");
		//WebElement eyeicon = driver.findElement(By.xpath("//div[@class='disableddiv showPassword shownhide']"));
		WebElement eyeicon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		//To perform click action
		Actions action=new Actions(driver);
		action.clickAndHold(eyeicon).perform();
		Thread.sleep(2000);
		action.release(eyeicon).perform();
	
	}

}
