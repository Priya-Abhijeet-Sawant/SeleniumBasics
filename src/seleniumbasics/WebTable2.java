package seleniumbasics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();

		List<WebElement> a = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td/strong")); 

		List<WebElement> ch = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < a.size(); i++) {

			if (a.get(i).getText().startsWith("C")) {
				ch.get(i).click();
			}
			}
	}
}
