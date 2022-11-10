package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALertHandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
    Thread.sleep(2000);
    
   // driver.switchTo().alert().accept(); //This is to accpet the alert
   
    System.out.println(driver.switchTo().alert().getText());  //To print text on alert
    
    driver.switchTo().alert().dismiss();// This is to dismiss the alert
    
    // driver.switchTo().alert().sendKeys("hello"); //To send som data in input box
}
}
