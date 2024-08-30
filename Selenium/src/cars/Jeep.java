package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jeep {
	@Test(groups="Integration")
	public void jeepMethod()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.jeep-india.com/");
		Reporter.log("Jeep Got Launched", true);
		driver.quit();
		
	}

}
