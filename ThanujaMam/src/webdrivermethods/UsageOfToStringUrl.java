package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToStringUrl {
public static void main(String[] args) throws Throwable {
	//set the driver executable path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//Instantiate the browser specific class
			ChromeDriver driver = new ChromeDriver();
			//pre-condition
			driver.manage().window().maximize();
			//pass the main url of the appln
			driver.get("https://www.dassault-aviation.com/en/");
			Thread.sleep(2000);
			driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
			Thread.sleep(2000);
			driver.manage().window().minimize();
			driver.quit();
}
}
