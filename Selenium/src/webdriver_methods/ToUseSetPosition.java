package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSetPosition {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://skillrary.com/");
		
		Thread.sleep(2000);
		
		Point p=new Point(180,90);
		
		//driver.manage().window().setPosition(p);
		driver.manage().window().setPosition(new Point(200,200));
		

	}

}
