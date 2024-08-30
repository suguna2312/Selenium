package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetPosition {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		//driver.get("https://skillrary.com/");
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		//To check if we can use getX and getY methods
		Point posOfPage = driver.manage().window().getPosition();
		System.out.println(posOfPage);
		System.out.println(posOfPage.getX());
		System.out.println(posOfPage.getY());
	}

}
