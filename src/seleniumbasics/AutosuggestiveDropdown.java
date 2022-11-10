package seleniumbasics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutosuggestiveDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement a = driver.findElement(By.xpath("//input[@id='autosuggest']"));
		a.sendKeys("ind");
		Thread.sleep(2000);		
		/* This is not recommonded for selecting 
		 * a.sendKeys(Keys.ARROW_DOWN);
		 * a.sendKeys(Keys.ARROW_DOWN); 
		 * a.sendKeys(Keys.ENTER);
		 */

		List<WebElement> b = driver.findElements(By.xpath("//a[@class='ui-corner-all']")); 
		//for loop is not most recommended
		/* for(int i=0;i<b.size();i++) { 
		 * System.out.println(b.get(i).getText());
		 * if(b.get(i).getText().equalsIgnoreCase("Indonesia")) {
		 * b.get(i).click(); 
		 * break; } } */
		
		//for each loop---most recommended
		for (WebElement k : b){
			if (k.getText().equalsIgnoreCase("India")) {
				k.click();
				break;
			}
		}
	}
}
