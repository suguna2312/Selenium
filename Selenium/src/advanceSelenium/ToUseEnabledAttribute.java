package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseEnabledAttribute {
	
	
		@Test(enabled=true)
			public void cricbuzz() {//TestCase
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.cricbuzz.com/");
				Reporter.log("Cricbuzz got executed",true);//TestSteps
				driver.quit();
			}
			
		@Test(enabled=true)
			public void bigbasket() {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.bigbasket.com/");
				Reporter.log("baskinRobbins got executed",true);
				driver.quit();
			}
			
		@Test(enabled=false)
			public void amazon() {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				Reporter.log("amazon got executed",true);
				driver.quit();
			}

}
