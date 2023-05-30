package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement loginButton = driver.findElement(By.name("login"));
	if (loginButton.isEnabled()) {
		System.out.println("Login Button is enabled i.e it is active");
		loginButton.click();
	}else {
		System.out.println("Login Button is disabled i.e it is inactive");
	}
}
}
