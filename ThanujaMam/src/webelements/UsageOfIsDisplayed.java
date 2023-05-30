package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement emailTextField = driver.findElement(By.id("email"));
	if (emailTextField.isDisplayed()) {
		System.out.println("Email Text field is dispalyed.");
		emailTextField.sendKeys("Thanuja");
	}else {
		System.out.println("Email Text field is not dispalyed.");
	}
}
}
