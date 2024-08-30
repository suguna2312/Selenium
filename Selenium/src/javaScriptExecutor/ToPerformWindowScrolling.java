package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformWindowScrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Flowers", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Images']")).click();
		// To use JavaScript Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (;;) {
			try {
				// driver.findElement(By.xpath("//div[text()='Why opt for flower delivery on
				// ...']")).click();
				driver.findElement(By.xpath("//div[text()='50 Most Beautiful Flowers in The World ...']")).click();
				break;
				} catch (Exception e) {
				// select string value one
				// js.executeScript("window.scrollBy(0,500)");
				js.executeScript("window.scrollBy(0,300)");
				}

		}

}
} 

