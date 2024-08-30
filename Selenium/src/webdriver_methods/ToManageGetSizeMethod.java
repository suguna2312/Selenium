package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageGetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://skillrary.com/");
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		//To maximize window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//To capture the size of the browser
		Dimension sizeOfBrowser = driver.manage().window().getSize();
		System.out.println(sizeOfBrowser);//1050,652 1296,688
		
		
		//To check if we can use getHeight and getWidth methods
		Window browserSize = driver.manage().window();
		System.out.println(browserSize.getSize().getHeight());
		System.out.println(browserSize.getSize().getWidth());
				

	}

}
