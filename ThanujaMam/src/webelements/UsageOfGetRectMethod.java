package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetRectMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement emailTextField = driver.findElement(By.id("email"));
	Rectangle emailRect = emailTextField.getRect();
	int HETF = emailRect.getHeight();
	System.out.println("HETF = " + HETF);
	int WETF = emailRect.getWidth();
	System.out.println("WETF = " + WETF);
	int emailStartX = emailRect.getX();
	System.out.println("emailStartX = " + emailStartX);
	int emailStartY = emailRect.getY();
	System.out.println("emailStartY = "+ emailStartY);
	
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Rectangle PassWordRect = passwordTextField.getRect();
	int PassHeight = PassWordRect.getHeight();
	System.out.println("PassHeight = " + PassHeight);
	int PassWidth = PassWordRect.getWidth();
	System.out.println("PassWidth = " + PassWidth);
	int passStartX = PassWordRect.getX();
	System.out.println("passStartX = " + passStartX);
	int passStartY = PassWordRect.getY();
	System.out.println("passStartY = " + passStartY);
}
}
