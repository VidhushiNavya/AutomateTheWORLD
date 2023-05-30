package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {
public static void main(String[] args) {
	//set the driver executable path
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 // Instantiate the browser specific class
 ChromeDriver driver = new ChromeDriver();
 //pass the main url of the appln 
 driver.get("https://www.facebook.com/signup");
 String expectedResult = "https://www.facebook.com/signup";
 System.out.println("expectedResult = " + expectedResult);
 // getCurrentUrl() - String
 String actualResult = driver.getCurrentUrl();
 System.out.println("actualResult = " + actualResult);
 if (expectedResult.equals(actualResult)) {
	System.out.println("Pass: Expected Url is correct upon verification of Expected Result");	
}else {
	 System.out.println("Fail: Expected Url is incorrect upon verification of Expected Result");
}
			
}
}
