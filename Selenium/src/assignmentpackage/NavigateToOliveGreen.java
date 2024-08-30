package assignmentpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToOliveGreen {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.olivegarden.com/order-online");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		driver.manage().window().setSize(new Dimension(500,500));
		driver.close();
	}

}
