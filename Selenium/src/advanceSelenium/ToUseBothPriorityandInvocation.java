package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseBothPriorityandInvocation {

	//@Test(priority=-1)
		//@Test(priority=2,invocationCount = 1)
		@Test(invocationCount = 2)
//	@Test(enabled=false)
		public void cricbuzz() {//TestCase
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.cricbuzz.com/");
			Reporter.log("Cricbuzz got executed",true);//TestSteps
			driver.quit();
		}
		//@Test//(priority=-1)
		@Test(invocationCount = 0)
		//@Test(invocationCount = 3,threadPoolSize = 3)
	//@Test(enabled=true)
		public void bigbasket() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
			Reporter.log("baskinRobbins got executed",true);
			driver.quit();
		}
		//@Test//(priority=1)
		//@Test(priority=1,invocationCount = 2)
		@Test(invocationCount = 1)
//	@Test(enabled=false)
		public void amazon() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Reporter.log("amazon got executed",true);
			driver.quit();
		}
	
	
}
