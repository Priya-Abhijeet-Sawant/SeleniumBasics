package seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelHandling {
	public static void main(String[] args) throws IOException {
//website to handle xcel---------https://www.browserstack.com/guide/read-data-from-excel-using-selenium
		
		// Path of the excel file----- to read the excel file
		FileInputStream fis = new FileInputStream("C:\\Users\\abhic\\Downloads\\ExcelHandlingDemo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);	// Creating a workbook----to access the xcel file		
		XSSFSheet sheet = workbook.getSheetAt(0);	// to get the control of sheet

		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		String username=cell.toString();	//declaring string 	
		
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		System.out.println(cell1);
		String password= cell1.toString();	//declaring string

		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

		driver.findElement(By.xpath("//input[@id='Login']")).click();

	}
}
