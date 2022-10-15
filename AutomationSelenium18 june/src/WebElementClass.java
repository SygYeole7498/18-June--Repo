import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize(); // method chaining to browser maximize
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		List<WebElement> headerCells = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		List<WebElement> remeaningCells = driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
		System.out.println(headerCells.size() + remeaningCells.size());
		/*
		 * for (WebElement cell : headerCells) { System.out.println(cell.getText()); }
		 * for (WebElement cell : remeaningCells) { System.out.println(cell.getText());
		 * } 
		 * for (int i = 0; i < remeaningCells.size(); i++) {
		 * System.out.println(remeaningCells.get(i).getText()); }
		 */
		for (int i = 1; i <=rows.size(); i++) {
			List <WebElement >row_Cells;
			
			if(i==1) {
				row_Cells= driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th"));
			}
			else {
				row_Cells= driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td"));
			}
			
			for(int j=0; j<row_Cells.size(); j++) {
				System.out.print(row_Cells.get(j).getText()+"   ");
			}
			System.out.println();
		}

	}
}
