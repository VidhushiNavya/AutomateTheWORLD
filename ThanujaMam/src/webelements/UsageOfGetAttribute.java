package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	String expectedPalceholderText = "Username";
	System.out.println("expectedPalceholderText = " + expectedPalceholderText);
	WebElement usernameTextFiled = driver.findElement(By.id("username"));
	String actualPalceholderText = usernameTextFiled.getAttribute("placeholder");
	System.out.println("actualPalceholderText = " + actualPalceholderText);
	if (actualPalceholderText.equals(expectedPalceholderText)) {
		System.out.println("Pass: Actual palceholderText is correct as per expected");
	}else {
		System.out.println("Fail: Actual palceholderText is incorrect as per expected");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
