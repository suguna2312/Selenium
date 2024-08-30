package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseISSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//Upcasting//cross browser testing
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement listBoxEle = driver.findElement(By.xpath("//option[text()='Free ( 90 ) ']"));
		System.out.println("Before selecting");
		System.out.println(listBoxEle.isSelected());
		
		System.out.println("after selecting");
		listBoxEle.click();
		System.out.println(listBoxEle.isSelected());
		//boolean result = listBoxEle.isSelected();

		
	}

}
