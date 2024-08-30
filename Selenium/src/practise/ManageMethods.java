package practise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//Optimizing code
		//Options man = driver.manage();
		//man.window().maximize();
		//Window manW= driver.manage().window();
		//manW.minimize();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		Dimension sizeOfPage = driver.manage().window().getSize();
		System.out.println(sizeOfPage);
		Thread.sleep(3000);
		Dimension d=new Dimension(600, 600);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(500, 500));
		Thread.sleep(3000);
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		Thread.sleep(3000);
		Point p=new Point(100, 100);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(200,200));
		Thread.sleep(3000);
		driver.quit();
		

	}

}
