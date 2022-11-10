package seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		driver.findElement(By.id("username")).sendKeys("anu");		
		driver.findElement(By.name("pw")).sendKeys("123");		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(2000);		
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		
		driver.findElement(By.partialLinkText("Forgot Your")).click();
		driver.findElement(By.name("cancel")).click();
		
		driver.close(); 
	}
}
