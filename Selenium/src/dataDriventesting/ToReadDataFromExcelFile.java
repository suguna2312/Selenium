package dataDriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step1: create an obj of FileInputStream
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");

		// step2: create respective file(Workbook for xls) obj
		Workbook wb = WorkbookFactory.create(fis);

		// step3: call respective methods
		String URL = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String USERNAME = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String PASSWORD = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();

		// Automation Script

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);

	}

}
