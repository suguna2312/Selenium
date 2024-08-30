
package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");

		//To Identify dropdown
		WebElement multipleListBox = driver.findElement(By.id("cars"));
		
		//using Select class
		Select multiselect=new Select(multipleListBox);
		System.out.println(multiselect.isMultiple());
		
		//To select
		multiselect.selectByIndex(0);
		multiselect.selectByValue("99");
		multiselect.selectByValue("399");
		Thread.sleep(4000);
		
		//To deselect
		//multiselect.deselectByIndex(0);
		//multiselect.deselectByValue("99");
		multiselect.deselectAll();
		driver.quit();
		
		
		
		

	}

}
