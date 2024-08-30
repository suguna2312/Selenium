
package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNg {//TestNG class
	//@Test(priority=-1)
	@Test(invocationCount = 2)
	public void cricbuzz() {//TestCase
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed",true);//TestSteps
		driver.quit();
	}
	//@Test//(priority=0)
	@Test(invocationCount = 1)
	public void baskinRobbins() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskinRobbins got executed",true);
		driver.quit();
	}
	//@Test//(priority=1)
	@Test(priority=1,invocationCount = 3,threadPoolSize = 2)
	public void amazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got executed",true);
		driver.quit();
	}
	

}
