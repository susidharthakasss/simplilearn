package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://simplilearn.com");
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://simplilearn.com");

	}

}
