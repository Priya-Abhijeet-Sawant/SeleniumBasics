package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0

		// To take the full screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\bhagy\\Desktop\\demo\\test1.png"));

		// Taking partial screenshot
		WebElement b = driver.findElement(By.xpath("//input[@id='name']"));

		File src1 = b.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src1, new File("C:\\Users\\bhagy\\screenshot1.png"));
	}
}
