package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandlingPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);

		WebElement a = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(a);

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);

		// program for selecting future date
		String t = "";
		while (!(t.equals("November"))) {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			t = month.getText();
		}
		List<WebElement> b = driver.findElements(By.xpath("//td[@data-month='10']"));
		for (WebElement k : b) {
			if (k.getText().equalsIgnoreCase("20")) {
				k.click();
				break;
			}
		}
	}
}
