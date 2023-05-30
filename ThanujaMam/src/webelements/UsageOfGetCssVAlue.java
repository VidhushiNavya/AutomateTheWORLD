package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssVAlue {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String expectedFontWeight = "400";
	System.out.println("expectedFontWeight = " + expectedFontWeight);
	WebElement loginButton = driver.findElement(By.className("_8eso"));
	String actualFontWeight = loginButton.getCssValue("font-weight");
	System.out.println("actualFontWeight = " + actualFontWeight);
	if (actualFontWeight.equals(expectedFontWeight)) {
		System.out.println("Pass: Font-weight is correct as per expected ");
	}else {
		System.out.println("Fail: Font-weight is incorrect as per expected ");
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}
