package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoActionclass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Diffrence between action and actions
		// action--interface //actions-- class

		Actions a = new Actions(driver);

		WebElement b = driver.findElement(By.xpath("//button[@id='openwindow']"));

		// a.doubleClick(b).perform(); //double click in selenium

		a.contextClick(b).perform(); // Right click in selenium
	}
}
