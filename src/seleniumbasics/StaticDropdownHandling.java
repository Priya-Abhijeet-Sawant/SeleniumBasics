package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownHandling {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	
	WebElement a= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
    a.click();
    
    //How to handle static dropdown---if tagname is 'select' then you can handle it like below
    Select s=new Select(a);
    s.selectByIndex(1);
    Thread.sleep(2000);
    s.selectByValue("AED");
    Thread.sleep(2000);
    s.selectByVisibleText("USD");
    
    //for adding total no of adults
    driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
    Thread.sleep(2000);
//    for(int i=0;i<7;i++) {
//    driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
//    }
    for(int i=0;i<9;i++) {
        driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
        }
    Thread.sleep(2000);
    System.out.println(driver.switchTo().alert().getText());  //To print text on alert
      
    driver.close();
    
    
    
    
}
}