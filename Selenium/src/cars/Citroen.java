package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Citroen {
	@Test(groups="functional")
	public void citroenMethod()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.citroen.in/");
		Reporter.log("citroen car launched", true);
		driver.quit();
	}

}
