package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.id("Email")).sendKeys("SeleniumE11@gmail.com");
		driver.findElement(By.id("Email")).sendKeys("seleniumtestinge11@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement sortByDropDown = driver.findElement(By.id("products-orderby"));
		Select sortBySelect=new Select(sortByDropDown);
		
		sortBySelect.selectByVisibleText("Price: High to Low");
		
		//WebElement actualSortBySelectedValue = sortBySelect.getFirstSelectedOption();
		//String actualSelectedValue = actualSortBySelectedValue.getText();
		//System.out.println(sortBySelect.getFirstSelectedOption().getText());
	}

}
