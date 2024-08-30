package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		//WebElement DecorLink = driver.findElement(By.linkText("Decor"));
		WebElement bedRoomLink = driver.findElement(By.linkText("Bedroom"));
		Actions action=new Actions(driver);
		//action.moveToElement(DecorLink).perform();
		action.moveToElement(bedRoomLink).perform();
		//action.click(bedRoomLink).perform();
		
		Thread.sleep(4000);
		//driver.quit();
		//driver.findElement(By.linkText("2 Door Wardrobes")).click();

	}

}
