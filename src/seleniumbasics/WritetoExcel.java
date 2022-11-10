package seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritetoExcel {
	public static void main(String[] args) throws IOException {
		String fis = "C:\\Users\\abhic\\Downloads\\ExcelHandlingDemo.xlsx";
		FileInputStream fs = new FileInputStream(fis);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		Sheet sheet2 = workbook.getSheetAt(1);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		for (int i = 1; i < sheet2.getPhysicalNumberOfRows(); i++) {
			try {
				Row row = sheet2.getRow(i);
				Cell cell = row.getCell(0);
				driver.get(cell.toString());
				System.out.println(driver.getTitle());

				// code to write the title in excel
				row = sheet2.getRow(i);
				cell = row.createCell(1);
				cell.setCellValue(driver.getTitle());
			} catch (Exception e) {
				System.out.println("link not present");
			}
			FileOutputStream fos = new FileOutputStream(fis);
			workbook.write(fos);
			fos.close();
		}
	}
}