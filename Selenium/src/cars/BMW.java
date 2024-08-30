package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMW {
	@Test(groups="smoke")
	public void bmwMethod()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("BMW launched",true);
		driver.quit();
	}

}
