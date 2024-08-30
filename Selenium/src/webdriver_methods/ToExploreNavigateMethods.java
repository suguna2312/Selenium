

package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		//To use Navigate methods or open the application(alternate way )
		
		driver.navigate().to("https://www.flipkart.com/");
		
		//To open application without using get()
		//driver.navigate().to(new URL("https://www.flipkart.com/"));
		driver.navigate().to(new URL("https://www.flipkart.com/"));
		Thread.sleep(2000);
		//(use url &  Cntrl+space and select java.net)
		Navigation nav = driver.navigate();
		nav.back(); 	//Empty browser'
		
		Thread.sleep(2000);
		nav.forward();	//flipkart
		Thread.sleep(2000);
		nav.refresh();
		

	}

}
