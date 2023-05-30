package webelements;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAbscuredElementByClickMethod {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	// without handling the abscured element if we try to click on target element then u will get
	// ElementClickInterceptedException - Unchecked Exception - from selenium library
	WebElement changeAddress = driver.findElement(By.xpath("//span[contains(text()='Change Address')]"));
	changeAddress.click();
	//WebElement dontChangeButton = driver.findElement(By.xpath("//span[@class='a-button-inner']//span[contains(text(),\"Don't Change\")]]"));
	//dontChangeButton.click();
	//dontChangeButton.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	WebElement customerServiceLink = driver.findElement(By.xpath("//div[@id='nav-xshop-container']//a[text()='Customer Service']"));
	customerServiceLink.click();
	Thread.sleep(3000);
}
}
