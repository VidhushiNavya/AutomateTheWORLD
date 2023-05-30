package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
public static void main(String[] args) throws Throwable {
	//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//pre-condition
		driver.manage().window().maximize();
		//pass the main url of the appln
		driver.get("https://demoqa.com/browser-windows");
		// getWindowHandle() - String 
		// It will capture one wid - i.e the window which is under driver control
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow = " + parentWindow);
		driver.findElement(By.id("windowButton")).click();
		Set<String> allWindowIdS = driver.getWindowHandles();
		for (String wid : allWindowIdS) {
			String url = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(url);
			if (url.equals("https://demoqa.com/browser-windows")) {
				
			}else if (url.equals("https://demoqa.com/sample")) {
				//getSize() - Dimension Class object - Dimension Selenium class
				// Dimension class contains 2 static methods getHeight() and getWidth() 
				// both the methods will return int. 
			     Dimension childWindowSize = driver.manage().window().getSize();
			     int heightOfChildWindow = childWindowSize.getHeight();
			     System.out.println("heightOfChildWindow = " + heightOfChildWindow);
			     int widthOfChildWindow = childWindowSize.getWidth();
			     System.out.println("widthOfChildWindow = " + widthOfChildWindow);
			   //getPosition() - Point Class object - Point Selenium class
			   // Point class contains 2 static methods getX() and getY() 
			   //both the methods will return int.
			     Point childWindowPosition = driver.manage().window().getPosition();
			     int startX = childWindowPosition.getX();
			     System.out.println("startX = " + startX);
			     int startY = childWindowPosition.getY();
			     System.out.println("startY = " + startY);
			     Thread.sleep(2000);
			     // we need to create the object for dimension and point to set the size and position.
			     Dimension definedSize = new Dimension(200, 900);
			     driver.manage().window().setSize(definedSize);
			     Thread.sleep(2000);
			     Point definedPosition = new Point(20, 90);
			     driver.manage().window().setPosition(definedPosition);
			     Thread.sleep(2000);
			}
				
			}
		//post- condition 
		driver.manage().window().minimize();
		// terminating condition
		driver.quit();
		}
}

