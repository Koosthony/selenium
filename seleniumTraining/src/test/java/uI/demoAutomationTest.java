package uI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoAutomationTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver",	"C:\\Users\\koost\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("inventory_container")).click();
		//driver.close();
	}
}
