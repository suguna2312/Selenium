package assignmentpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToBarbequenation {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.barbequenation.com/");
		String sesId = driver.getWindowHandle();
		System.out.println(sesId);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Thread.sleep(2000);
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		Thread.sleep(2000);
		driver.quit();
	}

}
