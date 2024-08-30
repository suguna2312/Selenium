package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToValidateMenulistDWS {

	public static void main(String[] args) {
		String[]a= {"Amazon miniTV","Sell","Best Sellers","Today's Deals","Mobiles","Customer Service","Electronics"};
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
	List<WebElement> elements = driver.findElements(By.xpath("//div[@id='nav-xshop-container']/div/a"));
	String[]b=new String[elements.size()];
	int i = 0;
	for(WebElement ele:elements)
	{
		b[i++]=ele.getText();
	}
	for(int j=0;j<b.length;j++) {
		System.out.println(b[j]);
	}
	boolean flag=false;
	for(int k=0;k<a.length;k++) {
		if(a[k].equals(b[k])) {
			flag=true;
			
		}
		else {
			flag=false;
		}
	}
	if(flag==true) {
		System.out.println("Menu list is as per expected");
	}
	else {
		System.out.println("Menu list is as per expected");
	}
	

	}

}
