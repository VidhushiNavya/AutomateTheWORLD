package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmitMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	// Correct usage
	//<form>
   // <button> type="submit" </button>
   //</form>
	//driver.get("https://www.facebook.com/");
	//WebElement loginButton = driver.findElement(By.name("login"));
	//loginButton.submit();
	
	// wrong usage
	
	driver.get("https://demo.actitime.com/login.do");
	WebElement loginLink = driver.findElement(By.xpath("//div[text()='Login ']"));
	loginLink.submit();
}
}
