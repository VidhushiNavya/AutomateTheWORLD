package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {
public static void main(String[] args) throws Throwable {
		//set the driver executable path
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				//Instantiate the browser specific class
				WebDriver driver = new ChromeDriver();
				//maximize the browser window
				driver.manage().window().maximize();
				//pass the main URL of the application
				driver.get("https://www.facebook.com/");
				Thread.sleep(1000);
				// since css is used in building webpage 
				// By default css  can be understood by webpage so it is faster in execution.
				WebElement emailTextField = driver.findElement(By.cssSelector("input[id='email']"));
				emailTextField.sendKeys("Arpitha");
				Thread.sleep(1000);
				driver.manage().window().minimize();
				driver.quit();
}
}
