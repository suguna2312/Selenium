package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Thread.sleep(2000);
		
		Dimension d=new Dimension(500, 500);
		driver.manage().window().setSize(d);
		
		driver.manage().window().setSize(new Dimension(600, 700));
		Thread.sleep(2000);
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		Thread.sleep(2000);
		
		Point p=new Point(200,200);
		driver.manage().window().setPosition(p);
		driver.manage().window().setPosition(new Point(50,50));
		
		
		
		

	}

}
