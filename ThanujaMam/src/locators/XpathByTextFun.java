package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFun {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	//WebElement RegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
	//RegisterButton.click();
	//WebElement forgotPasswordLinkText = driver.findElement(By.xpath("//a[.='Forgot Password?']"));
	//forgotPasswordLinkText.click();
	WebElement forgotPasswordSubTagText = driver.findElement(By.xpath("//a[contains(.,'Forgot Pass')]"));
	forgotPasswordSubTagText.click();
}
}
