package seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/nested_frames");

		WebElement a = driver.findElement(By.xpath("//frame[@name='frame-top']"));

		driver.switchTo().frame(a);

		WebElement b = driver.findElement(By.xpath("//frame[@name='frame-middle']"));

		driver.switchTo().frame(b);

		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

		driver.switchTo().defaultContent();

		WebElement c = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(c);

		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());

	}
}
