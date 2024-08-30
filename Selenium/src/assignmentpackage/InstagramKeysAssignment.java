
package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramKeysAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		//Identify username and store it
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("suguna");
		username.sendKeys(Keys.CONTROL+"a");
		
		username.sendKeys(Keys.CONTROL+"C");
		
		Thread.sleep(2000);
		//Identify password and store it
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Keys.CONTROL+"V");
		driver.findElement(By.xpath("//button[text()='Show']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
