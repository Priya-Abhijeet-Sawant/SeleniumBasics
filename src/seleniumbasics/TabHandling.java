package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
	    
		
		driver.findElement(By.xpath("//a[@id=\"opentab\"]")).click();
	    
	    Set<String> obj=driver.getWindowHandles(); 
	                    //Parent window, child window  
	    
	    Iterator<String> k=obj.iterator();
	      
	     String parent_window= k.next();
	     String child_window=k.next();
	    
	     driver.switchTo().window(child_window);
	     
	     System.out.println(driver.getCurrentUrl());
	     Thread.sleep(2000);
	     
	     driver.switchTo().window(parent_window);
	     
	     System.out.println(driver.getCurrentUrl());
	}
}


