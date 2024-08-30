

package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		//To Identify dropdown
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));
		
		//To use select class
		Select daySelect=new Select(daydropdown);
		Select monthSelect=new Select(monthdropdown);
		Select yearSelect=new Select(yeardropdown);
		
		//call methods
		daySelect.selectByIndex(3);
		monthSelect.selectByValue("6");
 		yearSelect.selectByVisibleText("2023");
		
		System.out.println(daySelect.isMultiple());//false
		System.out.println(monthSelect.isMultiple());//false
		System.out.println(yearSelect.isMultiple());//false
		
		
		
		//To get everyoption present in dropdown
		List<WebElement> allMonths = monthSelect.getOptions();
		for(WebElement month:allMonths)
		{
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());//magic
			Thread.sleep(2000);
			
		}
		List<WebElement> allDays = daySelect.getOptions();
		for(WebElement days:allDays) {
			System.out.println(days.getText());
			daySelect.selectByValue(days.getText());
			Thread.sleep(2000);
		}
		
	}

}

