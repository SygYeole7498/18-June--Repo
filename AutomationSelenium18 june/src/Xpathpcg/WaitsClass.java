package Xpathpcg;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsClass {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		
		
		//Selenium Version 3.* Syntax
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//WebElement textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tex']")));
		
		// selenium Version 4.*
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // new version
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input [@type = 'te']")));
	

		
		Wait <WebDriver> fwait   =  new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(20))  // maximum waiting time
									.pollingEvery(Duration.ofSeconds(3))  // frequency 
									.ignoring(NoSuchElementException.class); // condition
	
		WebElement elele = fwait.until(new Function<WebDriver,WebElement>(){
		
			public WebElement apply (WebDriver driver)
			{
				return driver.findElement(By.xpath("dfghjk"));
			}	
		}); //Limited Time Period
	}
}
