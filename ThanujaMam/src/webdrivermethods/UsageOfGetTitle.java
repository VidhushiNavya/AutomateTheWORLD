package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
public static void main(String[] args) throws Throwable {
	//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//pass the main url of the appln 
		driver.get("https://www.facebook.com/");
		// getTitle() - String
		String facebookTile = driver.getTitle();
		System.out.println("facebookTitle = " + facebookTile);
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		String forgottenPageTitle = driver.getTitle();
		System.out.println("forgottenPageTitle = "+ forgottenPageTitle);
}
}
