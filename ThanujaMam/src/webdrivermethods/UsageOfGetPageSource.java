package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSource {
public static void main(String[] args) {
	//set the driver executable path
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 // Instantiate the browser specific class
 ChromeDriver driver = new ChromeDriver();
 //pass the main url of the appln 
 driver.get("https://www.facebook.com/");
 String ExpectedText = "Facebook helps you connect and share with the people in your life.";
 System.out.println("ExpectedText = " + ExpectedText);
 // It Will capture entire page source and also it will verify and validate the text
 // getPageSource() - String
 String actualText = driver.getPageSource();
System.out.println("actualText = " + actualText);
if (actualText.contains(ExpectedText)) {
	System.out.println("Pass: The Expected Text is paresent in the login page of the facebook");
	
}else {
	System.out.println("Fail: The Expected Text is not paresent in the login page of the facebook as expected");
}
}
}
