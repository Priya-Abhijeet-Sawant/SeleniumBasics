package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		// program for selecting current date
		List<WebElement> a = driver.findElements(By.xpath("//td[@data-month='9']"));
		for (WebElement k : a) {
			if (k.getText().equalsIgnoreCase("25")) {
				k.click();
				break;
			}
		}
		//(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr//td[@data-handler="selectDay"]
	}
}
