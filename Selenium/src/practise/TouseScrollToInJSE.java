package practise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TouseScrollToInJSE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//To scroll to bottom of the page
		//js.executeScript("window.scrollTo( 0, document.body.scrollHeight )");
		js.executeScript("window.scrollTo( 0,580)");
		//Thread.sleep(2000);
		//driver.quit();
		
	}

}
