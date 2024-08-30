package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseConfirmationpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://licindia.in/");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		Alert ConfirmationPopup = driver.switchTo().alert();
		System.out.println(ConfirmationPopup.getText());
		
		ConfirmationPopup.accept();
		//ConfirmationPopup.dismiss();
		Thread.sleep(4000);
		driver.quit();

	}

}
