package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		WebElement a = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(a);// This will switch control inside the frame

		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions b = new Actions(driver);

		b.dragAndDrop(source, destination).build().perform();

		driver.switchTo().defaultContent(); // This will switch control outside the frame

		// Practise website----https://testautomationpractice.blogspot.com/
	}
}
