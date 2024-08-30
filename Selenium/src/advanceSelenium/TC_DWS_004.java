package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass {
	//To navigate to books and select option on "Sortby" dropdown and verify selected option
	
	String expectedData = "Books";
	String expectedSortByVisibleText = "Created on";
			//"Price: High to Low";

	@Test
	public void toSortBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
		
		String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		
		if (actualData.contains(expectedData)) {
			Reporter.log("Navigated to Books page successfuly", true);
		} else {
			Reporter.log("Failed to Navigate to Books page", true);
		}
		
		WebElement sortByDropDown = driver.findElement(By.id("products-orderby"));
		Select sortBySelect = new Select(sortByDropDown);
		sortBySelect.selectByIndex(5);
		//sortBySelect.selectByVisibleText("Price: High to Low");

		WebElement sortBySelectedValue = sortBySelect.getFirstSelectedOption();
		String actualSortBySelectedValue = sortBySelectedValue.getText();
		//Reporter.log(actualSortBySelectedValue, true);
		
		//Reporter.log(sortBySelectedValue.getText(), true);
		//Reporter.log(sortBySelect.getFirstSelectedOption().getText(), true);
		
		 if(actualSortBySelectedValue.equals(expectedSortByVisibleText)) {
		 Reporter.log("Successfully selected the required option", true); 
		 } 
		 else {
		 Reporter.log("Failed to select the required option", true);
		 }
		 
	}

}

