package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetMethod {
	public static void main(String[] args) {
		//To launch empty browser
		ChromeDriver driver=new ChromeDriver();
		
		//To Open application
		driver.get("https://www.instagram.com/");
	}

}
