package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginToFacebook {

	public static void main(String[] args) {
		
		//Expected Data
		String expectedLoginPageTitle = "Facebook – log in or sign up";
		String expectedUserName = "suguna";
		String expectedPassword = "12345789";
		
		//To open Browser
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser got Launched");
		driver.manage().window().maximize();
		System.out.println("Browser got Maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Enter URL
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle))
		{
			System.out.println("Navigated Successfully to Facebook loginPage");
		}
		else
		{
			System.out.println("Failed to Navigate to Facebook LoginPage");
		}
		
		//Enter Username
		WebElement userNameTextfield = driver.findElement(By.id("email"));
		userNameTextfield.clear();
		userNameTextfield.sendKeys(expectedUserName);
		String actualUsername = userNameTextfield.getAttribute("value");
		if(actualUsername.equals(expectedUserName))
		{
			System.out.println("UsernameTextField accepted data");
		}
		else{
			System.out.println("UsernameTextField failed to accept data");
		}
		 
		//Enter Password
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedPassword);
		String actualPassword = passwordTextfield.getAttribute("value");
		if(actualPassword.equals(expectedPassword))
		{

			System.out.println("PasswordTextField accepted data");
		}
		else
		{
			System.out.println("PasswordTextField failed to accept data");
		}
		
		//To click on Login button
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("Successfully navigated to Facebook HomePage");
		
		driver.quit();
		
	}
	
	

}
