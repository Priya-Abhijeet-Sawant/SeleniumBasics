package seleniumbasics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get(" https://testautomationpractice.blogspot.com/");

	//WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));

	// a.click();

	List<WebElement> b = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	for (int i = 0; i <= b.size(); i++) {
		b.get(i).click();
	}
}	
}
