package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		String value = driver.findElement(By.linkText("Try Free")).getAttribute("class");
		//o/p:button header__button
		//String value = driver.findElement(By.linkText("Try Free")).getAttribute("href");
		//o/p:https://www.actitime.com/free-online-trial
		System.out.println(value);

	}

}
