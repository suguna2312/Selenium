package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseBrowser {
	

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://cornerhouseicecreams.com/");
		
		Thread.sleep(2000);
		
		//To Close
		driver.close();
		
				

	}

}
