package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreBooleanMethods {
	
	//isDisplayed and isEnabled
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();//Upcasting//cross browser testing
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(4000);
	System.out.println("Before entering data");
	
	//To locate loginButton
	WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println(loginbutton.isDisplayed());
	System.out.println(loginbutton.isEnabled());
	System.out.println("=================================");
	System.out.println("After entering data");
	driver.findElement(By.name("username")).sendKeys("Sugu2312");
	driver.findElement(By.name("password")).sendKeys("123456");
	System.out.println(loginbutton.isDisplayed());
	System.out.println(loginbutton.isEnabled());
	}

}
