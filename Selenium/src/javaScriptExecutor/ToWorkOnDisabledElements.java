package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkOnDisabledElements {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	driver.findElement(By.linkText("jdk-8u421-linux-aarch64.rpm")).click();
	Thread.sleep(2000);
	//in regular process navigate to disable element and inspect it n store that webelement address
	WebElement disabledEle = driver.findElement(By.linkText("Download jdk-8u421-linux-aarch64.rpm"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", disabledEle);
	
	driver.quit();
	
	}

}
