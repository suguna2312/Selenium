package webelement_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		for(;;)
		{
			try
			{
				driver.findElement(By.id("loginclose1")).click();
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(3000);
			}
		}
		List<WebElement> navEle = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
		for(WebElement ele:navEle)
		{
			System.out.println(ele.getText());
		}

	}

}
