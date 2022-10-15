import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize

		Thread.sleep(3000);

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File Dest = new File("S:\\Work\\Jull2A WS\\AutomationSelenium18 june\\ScreenshotFolder\\D");

		FileHandler.copy(source, Dest);

	}
}
