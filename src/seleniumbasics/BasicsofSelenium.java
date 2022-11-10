package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsofSelenium {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");

		// Interface //Class
		WebDriver driver = new ChromeDriver(); // To luanch the browser
		driver.get("https://www.amazon.in/"); // To open the url
		Thread.sleep(2000);
		
		driver.manage().window().maximize(); // This will maximize your window

		//driver.manage().window().minimize(); // This will minimize your window

		System.out.println(driver.getTitle()); // To print the title
	
		//System.out.println(driver.getCurrentUrl()); // To get the current url
	
		driver.navigate().back(); // This will naviagte backward

		Thread.sleep(2000); //This will wait for 2 seconds

		driver.navigate().forward(); // This will naviagte forward

		driver.navigate().refresh(); // This will refresh the page

		driver.close(); // To close the current opened browser

		//driver.quit();	To close the all opened browsers

	}
}
