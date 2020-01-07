package bootcamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
    WebDriver driver;
public static void main(String[] args) {
    	WebDriverManager.chromedriver().version("77.0.3865.40").setup();
    	WebDriver driver = new ChromeDriver();
    	driver.get("www.google.com");
    	driver.close();
    	driver.quit();
	}
    }


    
    
