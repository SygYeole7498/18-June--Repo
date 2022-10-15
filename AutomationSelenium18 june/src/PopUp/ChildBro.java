package PopUp;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBro {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize
		Thread.sleep(4000);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(2000);
		String mainWindowId = driver.getWindowHandle(); // return ID of main Window
		String expUrl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		String expID = "";
		Set<String> allAdd = driver.getWindowHandles(); // main + ID of Child Windows //Id of main window always stored
														// at 1st position
		ArrayList <String> ar= new ArrayList<String>(driver.getWindowHandles());
		String id= ar.get(2);
		driver.switchTo().window(id); 
		//Main Window id= Index 0
		//Last Opened Child W id= Index 1
		//First Opened Child W id= Last Index Of ArrayList
			
		for (String s : allAdd) {
			System.out.println(s); // Fetching one by one from se;t
			driver.switchTo().window(s); // switch to new window by using ID
			String actURL = driver.getCurrentUrl(); // fetching the URL of new window after switch
			if (expUrl.equals(actURL)) {
				System.out.println("correct Window");
				expID = s; // stored ID after switch in correct window
				break;
			} else {
				System.out.println("Wrong Window");
			}
		}


		driver.switchTo().window(expID); // switch to expected window by ID.
	}
}
