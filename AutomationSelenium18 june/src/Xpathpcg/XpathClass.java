package Xpathpcg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // Browser Launch
	driver.manage().window().maximize(); // method chaining to browser maximize

	driver.get("https://facebook.com"); // URL insert

	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Velocity.com");
	
	driver.findElement(By.xpath("//button[text()='Log In']")).click();

	//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
}
}
