package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		WebElement MouseHoverMenu = driver.findElement(By.xpath("//button[@id=\"mousehover\"]"));
		Thread.sleep(2000);
		
		//WebElement TopMenu = driver.findElement(By.xpath("//a[@href='#top']"));

		Actions a = new Actions(driver);
		
		a.moveToElement(MouseHoverMenu).perform();

		//a.moveToElement(MouseHoverMenu).moveToElement(TopMenu).perform();
		
	}
}