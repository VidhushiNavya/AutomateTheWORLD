package create_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementNotInteractable_Exception {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	// org.openqa.selenium.ElementNotInteractableException - Element is present in the HTML/DOM. 
	// But it is not displayed in the webpage.
	//WebElement tShirtText = driver.findElement(By.xpath("//li/a[text()='T-Shirts' and @href='/men-tshirts']"));
	//tShirtText.click();
	Actions actions = new Actions(driver);
	WebElement menText = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	actions.moveToElement(menText).perform();
	Thread.sleep(2000);
	WebElement tShirtText = driver.findElement(By.xpath("//li/a[text()='T-Shirts' and @href='/men-tshirts']"));
	actions.click(tShirtText).perform();
	
}
}
