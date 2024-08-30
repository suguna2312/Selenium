package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WoodenStreetNotificationPopUp {

	public static void main(String[] args) {
		EdgeOptions setting=new EdgeOptions();
		//setting.addArguments("--incognito");
		setting.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(setting);
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://www.hyundai.com/in/en");
		driver.get("https://www.woodenstreet.com/");
		
		
	}

}
