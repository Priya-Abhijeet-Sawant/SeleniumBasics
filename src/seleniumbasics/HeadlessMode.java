package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");

		// create object of chrome options
		ChromeOptions options = new ChromeOptions();

		// add the headless argument
		options.addArguments("headless");

		// pass the options parameter in the Chrome driver declaration
		WebDriver driver = new ChromeDriver(options);

		// Navigate to toolsQA site url
		driver.get("https://demoqa.com/");
		System.out.println(driver.getTitle());

	}

}
