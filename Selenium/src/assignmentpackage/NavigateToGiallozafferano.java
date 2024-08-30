package assignmentpackage;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToGiallozafferano {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.giallozafferano.com/");
	Navigation nav = driver.navigate();
	nav.back();
	//driver.navigate().back();
	Thread.sleep(2000);
	//driver.navigate().forward();
	nav.forward();
	Thread.sleep(2000);
	//driver.navigate().refresh();
	nav.refresh();
	Thread.sleep(2000);
	driver.quit();

	}

}
