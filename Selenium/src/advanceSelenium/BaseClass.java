package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	//To import shortcut cntrl+shift+o
	public WebDriver driver;
	String ExpectedHomePgaeTitle="Demo Web Shop";
	//
	
	
	@Parameters("browserName")
	@BeforeClass
	public void toLaunch(@Optional("edge")String bName) {
		if(bName.equalsIgnoreCase("edge")) { 
			driver=new EdgeDriver();
		}else if(bName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(bName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		Reporter.log("Browser got Launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got Maximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualHomePgaeTitle = driver.getTitle();
		if(actualHomePgaeTitle.equals(ExpectedHomePgaeTitle))
		{
			Reporter.log("Successfully navigated to Demo web shop tricentis",true);
		}else
		{
			Reporter.log("failed to navigate to Demo web shop tricentis",true);
		}
		driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.id("Email")).sendKeys("SeleniumE11@gmail.com");
		driver.findElement(By.id("Email")).sendKeys("seleniumtestinge11@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Successfully logged in", true);
	}
	
	@AfterMethod
	public void toLogout()
	{
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logged out successfully", true);
	}
	@AfterClass
	public void toClose() {
		Reporter.log("Successfully closed Browser", true);
		driver.quit();
	} 
	
	
	
	
	
	
	
	

}
