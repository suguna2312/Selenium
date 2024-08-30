package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MarutiSuzuki {
	@Test(groups="smoke")
	public void maruthiSuzukiMethod()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.marutisuzuki.com/");
		Reporter.log("Maruthi Suzuki launched", true);
		driver.quit();
		
	}

}
