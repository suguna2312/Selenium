package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersatck_explicitwait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(75));
		driver.get("https://www.shoppersstack.com/products_page/17");
		driver.findElement(By.id("Check Delivery")).sendKeys("560087");
		//To Use Explicit wait
		//WebDriverWait is a class in selenium
		//conditions are given by us based on situations
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//particular condition by locator
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		/**
		 * ExpectedConditions is class in selenium
		 */
		//driver.findElement(By.id("Check")).click();
		WebElement checkButton = driver.findElement(By.id("Check"));
		//particular condition by WebElement element
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();

	}

	
}
