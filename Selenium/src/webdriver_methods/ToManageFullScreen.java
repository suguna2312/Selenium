package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageFullScreen {

	public static void main(String[] args) throws InterruptedException {
	
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://skillrary.com/");
		
		Thread.sleep(2000);
		
		//To maximize window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//To full screen the page
		driver.manage().window().fullscreen();
				

	}

}
