package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
    Thread.sleep(2000);
	
	if (keepLoggedInCheckBox.isSelected()) {
		System.out.println("+ve testing");
		System.out.println("keepLoggedInCheckBox is in the selected state");
	}else {
		System.out.println("-ve testing");
		System.out.println("keepLoggedInCheckBox is in the deselected state");
		keepLoggedInCheckBox.click();
	}
}
}
