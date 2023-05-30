package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultCapacityOfClickMethod {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement Dcocm = driver.findElement(By.linkText("Watch"));
	// the default capacity of the cilck() - It can scroll for certain pixels 
	// if it is a static webpage
	Dcocm.click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
}
}
