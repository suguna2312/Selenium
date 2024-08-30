package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hyundai {
	@Test(groups="smoke")
	public void hyundaiMethod()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyundai.com/in/en");
		Reporter.log("Hyndai Launched", true);
		driver.quit();
		
	}

}
