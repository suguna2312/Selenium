package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeFavSong {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		//usire usire kannada song
		//ElementNotInteractableException
		//driver.findElement(By.id("search")).sendKeys("usire usire kannada song");
		driver.findElement(By.name("search_query")).sendKeys("usire usire kannada song");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("video-title")).click();
		

	}

}
