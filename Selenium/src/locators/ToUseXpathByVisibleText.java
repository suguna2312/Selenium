package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByVisibleText {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	//we dnt have id,name,no <a so no linktext or partial linktext,
	//only class attribute is present which we dont consider ,so we cant use css selector also 
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

	}

}
