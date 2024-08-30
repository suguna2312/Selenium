package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetRect {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		Rectangle rect = driver.findElement(By.xpath("//button[@type='submit']")).getRect();
		
		System.out.println(rect);
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
	}

}
