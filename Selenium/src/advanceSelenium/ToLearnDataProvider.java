
package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@DataProvider(name="cred")
	public String[][] sendData()
	{
		String[][] saar= {{"abc@gmail.com","abc@123"},
				{"acd@gmail.com","acd@123"},
				{"xyz@gmail.com","xyz@123"},
				{"efg@gmail.com","efg@123"},
				{"abc@gmail.com","abc@123"},
				{"acd@gmail.com","acd@123"},
				{"xyz@gmail.com","xyz@123"},
				{"efg@gmail.com","efg@123"}
				
					};
		
		return saar; 
	}
	
	@Test(dataProvider="cred")
	public void login(String username,String password) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.quit();
	}

}

