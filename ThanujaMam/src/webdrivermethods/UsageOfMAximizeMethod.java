package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfMAximizeMethod {
public static void main(String[] args) throws Throwable {
	//set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Instantiate the browser specific class
	ChromeDriver driver = new ChromeDriver();
	//pre-condition
	driver.manage().window().maximize();
	//pass the main url of the appln
	driver.get("https://www.meesho.com/");
	// as per requirment 
	//driver.manage().window().fullscreen();
	Thread.sleep(2000);
	//post-condition
	driver.manage().window().minimize();
	Thread.sleep(2000);
	// terminates the session
	driver.quit();
	
}

}
