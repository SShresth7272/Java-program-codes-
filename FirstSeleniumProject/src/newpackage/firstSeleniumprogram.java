package newpackage;

import org.openqa.selenium.Webdriver;
import org.openqa.seleniun.chrome.ChromeDriver;

public class firstSeleniumprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64.exe");
		Webdriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		

	}

}
