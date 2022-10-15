import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(2000);
		
		
		WebElement tryIt= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
	
		//js.executeScript("arguments[0].scrollIntoView(true)", tryIt);
		
		js.executeScript("window.scrollBy(0, 2000)"); //scrollDown
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -1000)"); //ScrollUp
		Thread.sleep(2000);
	
		/*
		 * js.executeScript("window.scrollBy(1000, 0)"); //Scroll Right
		 * Thread.sleep(2000); js.executeScript("window.scrollBy(-3000, 0)"); //Scroll
		 * Left Thread.sleep(2000); js.executeScript("window.scrollBy(1000, 2000)");
		 * //Scroll Right+ScrollDown Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(-3000, 2000)"); //Scroll Left+ScrollDown
		 * Thread.sleep(2000); js.executeScript("window.scrollBy(1000, -2000)");
		 * //Scroll Right+ScrollUp Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(-3000, -3000)"); //Scroll Left+ScrollUp
		 * Thread.sleep(2000);
		 */
		
		
		
		
		
	}
}
