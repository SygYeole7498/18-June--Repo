import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		
		driver.manage().window().maximize(); // method chaining to browser maximize
		Thread.sleep(4000);
		driver.manage().window().minimize(); // (in old version 3.14 Ans:- NO)  in new version possible //minimze the browser
		Thread.sleep(4000);

		Options op= driver.manage();
		Window w = op.window();
		w.maximize();

		Dimension D1 = new Dimension(100, 400); //height and width of browser 
		driver.manage().window().setSize(D1); // set the Size of browser
		Thread.sleep(4000); // delay for 4 sec

		Point p = new Point(400, 400); //x and y coordinates of browser  
		driver.manage().window().setPosition(p); //set or change the position of browser

		// driver.get("https://www.selenium.dev/downloads"); //Url Insert

		driver.navigate().to("https://www.selenium.dev/downloads");// URL insert //Method chaining

		String url = driver.getCurrentUrl(); // return the URL of browser
		System.out.println(url);
		System.out.println(driver.getTitle()); // return the Title of tab

		Navigation nv = driver.navigate();
		nv.back(); // Backward

		nv.forward(); // click on Forward Button // forward
		Thread.sleep(2000); // wait for 2 sec

		nv.refresh(); // browser refresh/reload
		Thread.sleep(2000); // delay for 2 SEC
		
		System.out.println(driver.getCurrentUrl());  //return URL
		System.out.println(driver.getTitle());  //return the WebPage Title 
		
		driver.close(); // Fault 5 tabs 1
		driver.quit(); // All tab of BROWSER close
		// String url2= driver.getCurrentUrl(); //return the URL of browser
		// driver.close(); //current tab of BROWSER close
	}

}
