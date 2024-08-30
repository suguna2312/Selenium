package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSetSize {


public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://online.kfc.co.in/");
		
		Thread.sleep(2000);
		
		//To maximize window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//To capture the size of the browser
		//Dimension sizeOfBrowser = driver.manage().window().getSize();
		//System.out.println(sizeOfBrowser);//1050,652 1296,688
	Dimension d=new Dimension(500,500);
	Thread.sleep(2000);
	driver.manage().window().setSize(d);
	 driver.manage().window().setSize(new Dimension(600,400));
	 Thread.sleep(2000);
	 
	 driver.close();
	 
	 
	
		
				

	}


}
