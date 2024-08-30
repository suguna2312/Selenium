package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClassnameLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.instagram.com/");
		//Thread.sleep(4000);
		//driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("Suguna");
		
		//InvalidSelectorException 
		//Compound class names not permitted(alphanumeric,bcz its dynamic)
		//if class has username or email can be allowed bcz its not dynamic
		//driver.quit();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.className("email")).sendKeys("sugu2312@gmail.com");

	}

}
