package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String expectedTagText = "Forgotten password?";
	System.out.println("expectedTagText = " + expectedTagText);
	WebElement forgottenPassword = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/')]"));
	String actualTagText = forgottenPassword.getText();
	System.out.println("actualTagText = " + actualTagText);
	if (actualTagText.equals(expectedTagText)) {
		System.out.println("Pass: Actual tag text is correct as per expected ");
	}else {
		System.out.println("Fail: Actual tag text is incorrect as per expected ");	
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
