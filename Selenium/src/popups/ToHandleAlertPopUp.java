package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//HDFC popup is developed using frame hence we switch control
		driver.switchTo().frame("login_page");
		//driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		driver.findElement(By.linkText("CONTINUE")).click();
		Thread.sleep(2000);
		
		Alert alertPopup = driver.switchTo().alert();
		System.out.println(alertPopup.getText());
		alertPopup.accept();
		
		//alertPopup.dismiss();
		driver.quit();
		
		

	}

}


