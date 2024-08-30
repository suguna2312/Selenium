package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreet_ClosePopUpTab {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(2000);
		
		for(;;)
		{
			try
			{
				driver.findElement(By.id("loginclose1")).click();
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(3000);
			}
		}

	}

}
