package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageWindowMaximize {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://skillrary.com/");
		
		//To Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(300,300));
		Thread.sleep(2000);
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		Thread.sleep(2000);
		Point p=new Point(100,100);
		
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(180,90));
		Thread.sleep(2000);
		driver.quit();
		
				

	}

}
