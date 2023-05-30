package create_new;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	Actions actions = new Actions(driver);
	driver.get("https://www.cowin.gov.in/");
	WebElement abhaLink = driver.findElement(By.xpath("//a[text()='ABHA ']"));
    WebElement dashboardLink = driver.findElement(By.xpath("//a[text()=' Dashboard ']")); 
	WebElement verifyCertificateLink = driver.findElement(By.xpath("//a[text()=' Verify Certificate ']"));
	WebElement faqLink = driver.findElement(By.xpath("//a[text()=' FAQ ']"));
    WebElement partnersLink = driver.findElement(By.xpath("//a[text()=' Partners ']"));
	//actions.moveToElement(abhaLink).pause(2000).moveToElement(dashboardLink).pause(2000).moveToElement(verifyCertificateLink).pause(2000).moveToElement(faqLink).pause(2000).moveToElement(partnersLink).perform();
	//actions.moveToElement(abhaLink, 138, 0).pause(2000).moveToElement(abhaLink, 291, 0).pause(2000).moveToElement(abhaLink, 415, 0).pause(2000).moveToElement(abhaLink, 504, 0).perform();
	actions.moveToElement(abhaLink, 0, 0).pause(2000).moveToElement(abhaLink, 138, 0).pause(2000).moveToElement(dashboardLink, 152, 0).pause(2000).moveToElement(verifyCertificateLink, 123, 0).pause(2000).moveToElement(faqLink, 89, 0).perform();
}
}
