package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TouseTagnameLocator {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(4000);
	
	 List<WebElement> images = driver.findElements(By.tagName("img"));
	System.out.println(images.size());//each persons output changes
	//checking if tagname can be used for one element
	//WebElement img = driver.findElement(By.tagName("img"));
		//System.out.println(img);
	}

}
