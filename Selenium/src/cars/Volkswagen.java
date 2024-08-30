package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Volkswagen {
	@Test(groups="functional")
	public void volkswagenMethod()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.volkswagen.co.in/en.html");
		Reporter.log("Volkswagen launched",true);
		driver.quit();
		
	}

}
