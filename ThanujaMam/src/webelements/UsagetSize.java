package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsagetSize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement emailTextField = driver.findElement(By.id("email"));
	Dimension SizeOfEmailTextField = emailTextField.getSize();
	int HeightOfEmailTextField = SizeOfEmailTextField.getHeight();
	System.out.println("HeightOfEmailTextField = " + HeightOfEmailTextField);
	int WidthOfEmailTextField = SizeOfEmailTextField.getWidth();
	System.out.println("WidthOfEmailTextField = " + WidthOfEmailTextField);
	
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Dimension SizeOfPasswordTextField = passwordTextField.getSize();
	int HeightOfPasswordTextField = SizeOfPasswordTextField.getHeight();
	System.out.println("HeightOfPasswordTextField = " + HeightOfPasswordTextField);
	int WidthOfPasswordTextField = SizeOfPasswordTextField.getWidth();
	System.out.println("WidthOfPasswordTextField = " + WidthOfPasswordTextField);
	
	if (HeightOfEmailTextField==HeightOfPasswordTextField && WidthOfEmailTextField==WidthOfPasswordTextField) {
		System.out.println("Pass: Both email and password text field size is verified and found correct");
	}else {
		System.out.println("Fail: Both email and password text field size is verified and found incorrect");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
