package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTestPropertiesFileDataDrivenTesting {

	public static void main(String[] args) throws IOException {
		//step1:create object of FileInputStream
		FileInputStream fis=new FileInputStream("/org/testData1/testData1.properties");
		//FileInputStream fis=new FileInputStream("org/testData1/testData1.properties");
		//Step2:Create object of respective File type
		Properties prop=new Properties();
		
		//step3:call the respective methods
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		
		//Automation Script
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		
		
		
		
		
		
		
	}

}
