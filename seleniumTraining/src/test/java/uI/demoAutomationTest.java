package uI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoAutomationTest {
	// THESE FIRST STEP IS WHERE YOU WILL BE CHANGING FOR THE BROWSERE

	public static String browser = "chrome"; // external config - Xls, CSV
	public static WebDriver driver; // available globally

	public static void main(String[] args) throws InterruptedException {

 		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browser.equals("firfox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		// AUTOMATION SUITE PART.
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile phones");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

		driver.close();
	}
}
