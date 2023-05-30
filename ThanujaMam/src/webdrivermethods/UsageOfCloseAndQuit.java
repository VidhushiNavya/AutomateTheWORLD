package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCloseAndQuit {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(2000);
	driver.findElement(By.id("windowButton")).click();
	Thread.sleep(2000);
	// quit() - void
	// it will close all the windows which are opened in the perticular session
	//driver.quit();
	//close() - void
	// it will close only the window which is under browser control. 
	driver.close();
}
}
