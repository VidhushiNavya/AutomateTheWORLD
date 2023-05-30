package create_new;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement_Actions {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	Actions actions = new Actions(driver);
	driver.get("https://www.cowin.gov.in/");
	WebElement searchOption = driver.findElement(By.xpath("//button[text()='Search']"));
   // actions.scrollToElement(searchOption).pause(Duration.ofSeconds(2000)).click(searchOption).perform();	
    actions.scrollByAmount(0, 1000).pause(2000).click(searchOption).perform();
}
}
