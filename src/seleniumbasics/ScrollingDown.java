package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		 JavascriptExecutor js=(JavascriptExecutor)driver; //convert the driver into javascript
	       
	     //to scroll down the page         X  Y  Pixel
	         js.executeScript("window.scrollBy(0,800)");
	         
	       //to scroll up on the page         X  Y  Pixel
	        js.executeScript("window.scrollBy(0,-800)");
	        
	        //to scroll left on the page         X  Y  Pixel
	        js.executeScript("window.scrollBy(-800,0)");
	        
	        //to scroll right on the page         X  Y  Pixel
	        js.executeScript("window.scrollBy(800,0)");
	         
	        
	        
	        //This will scroll the page till the element is found 
	  WebElement a=driver.findElement(By.xpath(""));
	        js.executeScript("arguments[0].scrollIntoView();", a);
	        
	        
	        
	        
	        
	        a.click();
	        
	        //to perform scroll on an application till full height---

	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	        
	        
	         
	         
	         
	  
	 }

	
}
