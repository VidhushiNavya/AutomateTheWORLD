package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClearAndSendKeys {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement usernameTextField = driver.findElement(By.id("username"));
	Thread.sleep(2000);
	usernameTextField.clear();
	Thread.sleep(2000);
	usernameTextField.sendKeys("Navya");
	Thread.sleep(2000);
	WebElement passwordTextField = driver.findElement(By.id("password"));
	Thread.sleep(2000);
	passwordTextField.clear();
	Thread.sleep(2000);
	passwordTextField.sendKeys("123@qspiders");
	Thread.sleep(2000);
	WebElement signinButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
	signinButton.submit();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
