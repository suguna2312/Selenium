package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClick {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	WebElement addButton = driver.findElement(By.id("add"));
	
	//To Perform double click actions class
	Actions action=new Actions(driver);
	//action.doubleClick();
	action.doubleClick(addButton).perform();
	Thread.sleep(2000);
	action.doubleClick(addButton).perform();
	Thread.sleep(2000);
	action.doubleClick(addButton).perform();
	Thread.sleep(2000);
	action.doubleClick(addButton).perform();
	 
	Thread.sleep(2000);
	//driver.findElement(By.id("minus"));
	
			

	}

}
