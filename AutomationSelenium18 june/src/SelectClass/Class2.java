package SelectClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize
		driver.get("https://facebook.com"); // URL insert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()= 'Create New Account']")).click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(month);
		
		List<WebElement> list = s.getOptions();
		ArrayList<String> ar = new ArrayList<String>();

		for (WebElement w : list) {
			System.out.println(w.getText());
			String data = w.getText();
			ar.add(data);
		}
		Collections.sort(ar); // ArrayList
		System.out.println("#############");
		for (String s1 : ar) {

			System.out.println(s1);
		}
		System.out.println("#############");
		for(int i=ar.size()-1; i>=0; i--) {
			System.out.println(ar.get(i));
		}

	}
}
