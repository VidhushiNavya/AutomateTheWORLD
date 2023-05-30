package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText_Locator{
	public static void main(String[] args) {
		//set the driver executable path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//Instantiate the browser specific class
			WebDriver driver = new ChromeDriver();
			//maximize the browser window
			driver.manage().window().maximize();
			//pass the main URL of the application
			driver.get("https://www.facebook.com/");
			// if the text is PArtially dynamic then we will use partialLinkText
			WebElement partialText = driver.findElement(By.partialLinkText("ಕನ್ನಡ"));
			partialText.click();
	}
}
