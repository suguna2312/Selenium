package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mcdelivery.co.in/");
		Thread.sleep(2000);
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);//8820E0606C069A4E9ACBCF7E72636C0B
		//612CFC0A8B0F61D5B52E9FDFC347F1A3

	}

}
