package SelectClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); // Browser Launch
	driver.manage().window().maximize(); // method chaining to browser maximize
	driver.get("https://facebook.com"); // URL insert
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()= 'Create New Account']")).click();
	Thread.sleep(3000);
	WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
	Select s= new Select(month); 
	Thread.sleep(3000);
	s.selectByIndex(3);  //apr
	Thread.sleep(3000);
	s.selectByValue("12"); //dec
	Thread.sleep(3000);
	s.selectByVisibleText("Jan");

}
}
