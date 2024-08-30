package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		//True--top of webelement to top of webpage
		//false--bottom of webelement to bottom of webpage
		WebElement indianFlag = driver.findElement(By.xpath("//div[text()='India']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", indianFlag);
		//js.executeScript("arguments[0].scrollIntoView(true)", indianFlag);
		Thread.sleep(4000);
		
		driver.quit();
		

	}

}
