package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivionPopup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement hDP = driver.findElement(By.xpath("//button[text()='✕']"));
	Thread.sleep(2000);
	hDP.click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
