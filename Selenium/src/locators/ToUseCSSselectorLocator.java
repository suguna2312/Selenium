
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCSSselectorLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		//To Use CSS Selector,click on search button in demowebshoptricentis
		//driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		

	}

}
