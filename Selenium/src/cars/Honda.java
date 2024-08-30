package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Honda {
	@Test(groups="Integration")
	public void hondaMethod()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://automobiles.honda.com/");
		Reporter.log("Honda Got Launched", true);
		driver.quit();
		
	}

}
