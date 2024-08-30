package assignmentpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToYoutube {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
