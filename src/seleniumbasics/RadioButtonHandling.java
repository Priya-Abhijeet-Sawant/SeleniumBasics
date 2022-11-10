package seleniumbasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonHandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
	//Home work for radio button
	
    List<WebElement> a= driver.findElements(By.xpath("//input[@name=\"radioButton\"]"));
	
    //for clicking particular radio button
    WebElement radio2 = driver.findElement(By.xpath(" //input[@value='radio2']"));
    radio2.click();
    
   /*for(WebElement k:b) {
		k.click();	}*/
	}
}
