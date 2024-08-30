package dataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//Step1:create an obj of Fileinputstream
		//FileInputStream fis=new FileInputStream("./testData/testData.properties");
	//	FileInputStream fis=new FileInputStream("./testData/testData.properties");
		FileInputStream fis=new FileInputStream(".\\testData\\testData.properties");
		
		//step2: create obj of properties file
		Properties prop=new Properties();
		//step3:call methods
		prop.load(fis); 
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		
		
		//Automation Script
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);

	}

}
