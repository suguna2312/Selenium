package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg {
	//@Test(priority=-1)
	@Test(invocationCount = 2,threadPoolSize = 1)
	public void cricBuzz() {
		Reporter.log("Cricbuzz got exceuted", true);
	}
	//@Test(priority=0)
	@Test(invocationCount = 4)
	public void baskinRobbins() {
		Reporter.log("BaskinRobbins gpt executed", true);
	}
	//@Test(priority=1)
	@Test(invocationCount=6)
	public void amazon() {
		Reporter.log("amazon got executed", true);
	}

}
