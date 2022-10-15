import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize

		driver.get("https://facebook.com"); // URL insert

		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("VelocityClass");
	
		driver.findElement(By.id("pass")).sendKeys("password");
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("password?")).click();
	
		//driver.findElement(By.name("login")).click();
		
		
	}
}
