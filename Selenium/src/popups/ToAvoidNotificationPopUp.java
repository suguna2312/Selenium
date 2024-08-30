package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ToAvoidNotificationPopUp {

	public static void main(String[] args) throws InterruptedException {
		/*ChromeOptions setting=new ChromeOptions();
		//setting.addArguments("--disable-notifications");
		setting.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(setting);*/
		
		
		
		EdgeOptions setting=new EdgeOptions();
		setting.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.yatra.com/");
		Thread.sleep(4000);
		driver.quit();
		
	}

}
