package assignmentpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_FullMenuList {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	List<WebElement> menuList = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
	
	for(WebElement ele: menuList)
	{
		System.out.println(ele.getText());
	}
	}

}
