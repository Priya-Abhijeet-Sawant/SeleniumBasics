package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPractice {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.in/"); 

		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement ListMenu = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		
		a.moveToElement(ListMenu).perform();		
		
	}
}