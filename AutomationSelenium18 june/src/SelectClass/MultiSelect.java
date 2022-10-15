package SelectClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize
		driver.get("http://practice.cybertekschool.com/dropdown"); // URL insert
		Thread.sleep(3000);
		WebElement lan = driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s = new Select(lan);
		Thread.sleep(1000);
		s.selectByValue("java");
		Thread.sleep(1000);
		s.selectByValue("js");
		Thread.sleep(1000);
		s.selectByValue("c#");
		Thread.sleep(1000);

		WebElement firstSelected = s.getFirstSelectedOption(); // return First selected option
		System.out.println(firstSelected); // It will return webelement
		System.out.println(firstSelected.getText()); // return text of webelement
		System.out.println(s.getFirstSelectedOption().getText());// return text of webelement
		System.out.println(s.isMultiple()); // True verify listBox is Multi-selectable or not

		List<WebElement> l2 = s.getAllSelectedOptions();// Return all selected options only
		List<WebElement> l = s.getOptions(); // Return all options of listbox
		System.out.println(l.size()); // Count of Options present in listBox
		System.out.println(l2.size()); // count of selected options

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getText()); // Print text of All options
		}
		s.deselectByValue("java"); // deselect selected option
		Thread.sleep(3000);
		s.deselectByIndex(1);// deselect selected option
		Thread.sleep(3000);
		s.deselectByVisibleText("C#");// deselect selected option
		s.deselectAll(); // Deselect all selected options;
	
	

	}
}
