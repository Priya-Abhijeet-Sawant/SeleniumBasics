package seleniumbasics;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> a = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr/td[4]")); // div[@class='tableFixHead']/table/tbody/tr/td[4]
		int sum = 0;
		for (WebElement k : a) {
			String s = k.getText();
			// converting from string to integer
			int i = Integer.parseInt(s);
			sum = sum + i;
		}
		System.out.println(sum);

		WebElement b = driver.findElement(By.xpath("//div[@class='totalAmount']"));
		System.out.println(b.getText());
		String d = b.getText();

		String[] words = d.split(" ");
		System.out.println(Arrays.toString(words));

		String s = words[3];
		System.out.println(s);

		int k = Integer.parseInt(s);
		if (sum == k) {
			System.out.println("Addition is Matching");
		}
	}
}