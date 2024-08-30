package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseThreadPoolSize {
	
	
			
		@Test(threadPoolSize = 2)
		//@Test(enabled=false)
			public void cricbuzz() {//TestCase
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.cricbuzz.com/");
				Reporter.log("Cricbuzz got executed",true);//TestSteps
				driver.quit();
			}
			
		@Test(invocationCount = 3,threadPoolSize = 3,priority=-1)
		//@Test(enabled=true)
			public void bigbasket() {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.bigbasket.com/");
				Reporter.log("baskinRobbins got executed",true);
				driver.quit();
			}
			
		@Test(invocationCount = 2,threadPoolSize = 0,dependsOnMethods = "cricbuzz",enabled=true,priority=-2)
		//@Test(enabled=false)
			public void amazon() {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				Reporter.log("amazon got executed",true);
				driver.quit();
			}
			
	
	
	

}
