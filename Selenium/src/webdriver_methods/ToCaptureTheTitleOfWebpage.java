package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheTitleOfWebpage {
	public static void main(String[] args) {
		//To Launch empty chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//To open the application flipkart
		driver.get("https://www.flipkart.com/");
		//   driver.get("https://online.kfc.co.in/");
		
		//To capture the title of webpage
		String titleofwebpage = driver.getTitle();
		
		//To print the title
		System.out.println(titleofwebpage);
	}

}
