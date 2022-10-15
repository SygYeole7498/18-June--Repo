import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement changeLanguage = driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));
		WebElement actAndList = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']"));
		Actions act = new Actions(driver);
		//act.moveToElement(changeLanguage).perform(); // Move mouse cursor on perticular WebElement
		Thread.sleep(2000);
		//WebElement knLang = driver.findElement(By.xpath("//a[@href= '#switch-lang=kn_IN']"));
		//act.moveToElement(knLang).click().build().perform();
		// act.contextClick().perform(); //Right Click
		// act.contextClick(changeLanguage).perform(); //Right click on perticular
		// WebElement

		// act.moveToElement(changeLanguage).perform(); //Move mouse cursor on
		// perticular WebElement
		// act.click().perform(); //Left or regular click
		// act.click(changeLanguage).perform(); click on perticular WebElement

		// act.doubleClick().perform(); double click
		// act.doubleClick(changeLanguage).perform(); //double click on perticular
		// WebElement

		// Combining and executing multiple actions in one line
		// act.moveToElement(changeLanguage).click().build().perform();

		act.moveToElement(actAndList).perform();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Your Account']"))).click().build().perform();

	}
}
