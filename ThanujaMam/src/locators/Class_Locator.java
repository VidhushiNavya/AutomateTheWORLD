package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Locator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// If the class attribute value contains spaces,numbers,special character then 
	// we will get InvalidSelectorException.
	// we should not use class attribute bcoz it will be having many duplicates.
	WebElement emailTextFieldByClass = driver.findElement(By.className("inputtext _55r1 _6luy"));
	emailTextFieldByClass.sendKeys("Chandan");
			
}
}
