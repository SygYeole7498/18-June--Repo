package Xpathpcg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize
		driver.get("http://practice.cybertekschool.com/dropdown"); // URL insert
		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//a[text()= 'Create New Account'")).click();
		 */
		Thread.sleep(3000);
		WebElement lan = driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s = new Select(lan);
		Thread.sleep(3000);
		/*
		 * s.selectByValue("java"); Thread.sleep(3000); s.selectByValue("js");
		 * Thread.sleep(3000); s.selectByValue("c#"); Thread.sleep(3000);
		 * System.out.println(s.isMultiple()); Thread.sleep(3000);
		 * s.deselectByValue("java"); s.selectByValue("c#"); Thread.sleep(3000);
		 * s.selectByValue("ruby");
		 * System.out.println(s.getFirstSelectedOption().getText());
		 * System.out.println(s.getAllSelectedOptions().get(2).getText());
		 * //s.deselectAll();
		 */		
		
		List <WebElement> l= s.getOptions();
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i).getText());
		}
		/*
		 * Thread.sleep(3000); s.selectByIndex(3); // apr Thread.sleep(3000);
		 * s.selectByValue("12"); // dec Thread.sleep(3000);
		 * s.selectByVisibleText("Jan");
		 */	}
}
