package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureURL {

	public static void main(String[] args) {
		
		//To Launch empty browser
		ChromeDriver driver=new ChromeDriver();
		
		//To navigate to application
		driver.get("https://polarbear.co.in/");
		
		//to capture the url of webpage
		String urlofwebpage = driver.getCurrentUrl();
		
		//to print the output
		System.out.println(urlofwebpage);
	}

}
