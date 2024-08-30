package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoappSkillraryLoginDashboard {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	Thread.sleep(4000);
	driver.findElement(By.linkText("LOGIN")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("email")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.id("password")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.id("last")).click();
	Thread.sleep(4000);
	driver.quit();
	

	}

}
