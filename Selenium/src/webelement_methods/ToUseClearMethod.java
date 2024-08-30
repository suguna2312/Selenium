package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(4000);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		Thread.sleep(1000);
		usernameTextField.sendKeys("Suguna");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		Thread.sleep(1000);
		passwordTextField.sendKeys("Testing12356");

	}

}
