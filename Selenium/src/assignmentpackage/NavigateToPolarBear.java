package assignmentpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToPolarBear {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://polarbear.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
