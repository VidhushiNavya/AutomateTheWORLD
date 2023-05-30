package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ToCaptureTheColorOfLoginButton {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String expectedRGBVAlue = "#1877f2";
	System.out.println("expectedRGBVAlue = " + expectedRGBVAlue);
	WebElement loginButton = driver.findElement(By.name("login"));
	String actualRGBVale = loginButton.getCssValue("background-color");
	System.out.println("actualRGBVale = " + actualRGBVale);
	String backgroundColor = Color.fromString(actualRGBVale).asHex();
	System.out.println("backgroundColor = " + backgroundColor);
	if (backgroundColor.equals(expectedRGBVAlue)) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
