package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		
		//To capture source code
		
		String srcCode = driver.getPageSource();
		System.out.println(srcCode);

	}

}
