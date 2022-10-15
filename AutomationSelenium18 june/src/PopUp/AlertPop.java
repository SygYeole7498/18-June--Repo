package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver"); // URL insert
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='confirmation']")).click();

		Thread.sleep(1000);

		Alert alt = driver.switchTo().alert();
		//alt.getText();// Fetch the Text on Alert Popup

		alt.accept(); // Accept the Alert Pop-up (OK)

		//alt.dismiss(); // dismiss the Alert Pop-up (Cancle)
		//alt.sendKeys("Syg"); //Enter the Text into input field on Alert Pop-up.
	}
}
