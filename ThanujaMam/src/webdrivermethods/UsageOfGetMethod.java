package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethod {
public static void main(String[] args) throws Throwable {
	//set the driver executable path
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// Instantiate the browser specific class
	//ChromeDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();
	//pass the main url of the appln 
	// get() - default capacity - infinte waiting capacity
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
}
}
