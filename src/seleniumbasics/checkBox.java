package seleniumbasics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		//a.click();
		// Checkbox methods
//		   System.out.println(a.isDisplayed()); //true
//		   System.out.println(a.isEnabled()); //true
//		   System.out.println(a.isSelected());  //false

		List<WebElement> b = driver.findElements(By.xpath("//input[@type='checkbox']"));

		// System.out.println(b.size());
		
		// for loop
		for (int i = 0; i <= b.size(); i++) {
			b.get(i).click();
		}
		
		// for each loop
		for (WebElement k : b) {
			k.click();
		}
		
		// select even index---0, 2, 4
		/*for (int i = 0; i <= b.size(); i++) {
			if (i % 2 == 0) {
				b.get(i).click();
			}
		}
		// for odd index--- 1,3
		for (int i = 0; i <= b.size(); i++) {
			if (i % 2 != 0) {
				b.get(i).click();
			}
		}*/
	}
}
