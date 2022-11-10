package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAndCssSelector {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
//		Xapth--syntax- //tagName[@attribute='value'] 	
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test1");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
//		driver.findElement(By.xpath("//input[@id=\"Login\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@id=\"forgot_password_link\"]")).click();
//		driver.findElement(By.xpath("//input[@name=\"cancel\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@id=\"mydomainLink\"]")).click();
//		driver.close(); 
				
//SiblingXpath- following & preceding
		//parent -child sibling--  following
		//(ParentSiblingXpath/following-sibling::chilsSiblingTagname)

		//child-parent sibling--    preceding
		//ChildSiblingXpath/preceding-sibling::parentSiblingTagname
		
//Contains text xpath---- 
		//tagname[contains(text(),'actualText')]
		
//Css Selector---tagName[attribute='value'] 
		//parentCssSlector childTagName
		//IF multiple matches found--- parentCssSlector childTagName:nth-child(1)

		//child-parent - css selector---Not Possible-
		
	}
}