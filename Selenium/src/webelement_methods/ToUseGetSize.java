package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetSize {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		Dimension sizeOfWebelement = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
		System.out.println(sizeOfWebelement);
		System.out.println(sizeOfWebelement.getWidth());
		System.out.println(sizeOfWebelement.getHeight());
		//int width = sizeOfWebelement.getWidth();
		//int height = sizeOfWebelement.getHeight();
	}

}
