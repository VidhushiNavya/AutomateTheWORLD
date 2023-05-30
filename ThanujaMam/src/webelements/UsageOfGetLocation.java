package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement emailTextField = driver.findElement(By.id("email"));
	Point locationOfEWDTF = emailTextField.getLocation();
	int startX = locationOfEWDTF.getX();
	System.out.println("startX = " + startX);
	int startY = locationOfEWDTF.getY();
	System.out.println("startY = " + startY);
	
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Point locationPWDTF = passwordTextField.getLocation();
	int PassStartX = locationPWDTF.getX();
	System.out.println("PassStartX = " + PassStartX);
	int PassStartY = locationPWDTF.getY();
	System.out.println("PassStartY = " + PassStartY);
}
}
