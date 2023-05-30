package webdrivermethods;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToURLUrl {
public static void main(String[] args) throws Throwable {
	//set the driver executable path
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Instantiate the browser specific class
	ChromeDriver driver = new ChromeDriver();
	//pre-condition
	driver.manage().window().maximize();
	//pass the main url of the appln
	driver.get("https://www.dassault-aviation.com/en/");
	URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
	URL groupsPageUrl = new URL(mainUrl, "group/");
	driver.navigate().to(groupsPageUrl);
	Thread.sleep(2000);
	URL spacePageUrl = new URL(mainUrl, "space/");
	driver.navigate().to(spacePageUrl);
	
	
}
}
