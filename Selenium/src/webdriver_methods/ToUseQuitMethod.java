package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseQuitMethod {

	public static void main(String[] args) throws InterruptedException {
	
		
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://cornerhouseicecreams.com/");
			
			Thread.sleep(2000);//wait for 2sec
			
			//To Quit
			driver.quit();
			
			

	}

}
