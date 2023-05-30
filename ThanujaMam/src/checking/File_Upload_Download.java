package checking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Download {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	String actualLoginPageUrl = driver.getCurrentUrl();
	System.out.println("actualLoginPageUrl ="+actualLoginPageUrl);
    String actualLoginPageTitle = driver.getTitle();
    System.out.println("actualLoginPageTitle ="+actualLoginPageTitle);
    String exceptedLoginPageUrl = "https://demo.actitime.com/login.do";
    System.out.println("exceptedLoginPageUrl ="+exceptedLoginPageUrl);
    String exceptedLoginPageUrl1="actiTIME -Login";
    System.out.println("exceptedLoginPageUrl1 ="+exceptedLoginPageUrl1);
    if(actualLoginPageUrl.equals(exceptedLoginPageUrl1)) {
    	System.out.println("login page url is found correct and it is veified");
    	if(actualLoginPageTitle.equals(exceptedLoginPageUrl1)) {
    		System.out.println("login page title is found correct and it is veified");
    		System.out.println("pass:login page is displayed and it is verified upon the URL AND TITLE");
    	}
    else {
    	System.out.println("login page url is found incorrect and it is verified");
    	System.out.println("fail:login page is displayed and it is verified upon the URL AND TITLE");
    }
    System.out.println("login page url is found incorrect and it is veified");
}
           //step-03:Enter the valid username
        WebElement usernameTextfield=driver.findElement(By.id("username"));
        usernameTextfield.sendKeys("admin");
        //step-04:enter valid password
        WebElement passwordTextfield = driver.findElement(By.name("pwd"));
        passwordTextfield.sendKeys("manager");
        //step-05:click on login button
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
        String actualHomepageUrl = driver.getCurrentUrl();
        System.out.println("actualHomepageUrl ="+actualHomepageUrl);
        String actualHomepageTitle = driver.getTitle();
        System.out.println("actualHomepageTitle ="+actualHomepageTitle);
        String exceptedHomepageUrl = "https://demo.actitime.com/user/submit_tt.do";
        System.out.println("exceptedHomepageUrl ="+exceptedHomepageUrl);
        String exceptedHomepageTitle = "actiTIME - Enter Time-Track";
        System.out.println("exceptedHomepageTitle ="+exceptedHomepageTitle);
        WebElement logoutLink = driver.findElement(By.id("logoutLink"));
        logoutLink.click();
        if(actualHomepageUrl.equals(exceptedHomepageUrl)) {
        	System.out.println("Home page url is found correct and it is veified");
        	if(actualHomepageTitle.equals(exceptedHomepageTitle)) {
        		System.out.println("home page title is found correct and it is veified");
        		System.out.println("pass:Home page is displayed and it is verified upon the URL AND TITLE");
        	}
        else {
        	System.out.println("Home page url is found incorrect and it is verified");
        	System.out.println("fail:Home page is displayed and it is verified upon the URL AND TITLE");
        }
        System.out.println("Home page url is found incorrect and it is veified");
    }
        //step-06:click on logout button
        logoutLink.click();
        String actualLoginpageUrlAfterLogout = driver.getCurrentUrl();
        System.out.println("actualLoginpageUrlAfterLogout ="+actualLoginpageUrlAfterLogout);
        String actualLoginpageTitleAfterLogout= driver.getTitle();
        System.out.println("actualLoginpageTitleAfterLogout ="+actualLoginpageTitleAfterLogout);
        if(actualLoginpageUrlAfterLogout.equals(exceptedLoginPageUrl)) {
        	System.out.println("LoginPageAfterLogout URL is found correct and it is verified");
			if (actualLoginpageTitleAfterLogout.equals(exceptedLoginPageUrl)) {
				System.out.println("LoginPageAfterLogout title is found correct and it is verified");
				System.out
						.println("Pass: LoginPageAfterLogout is displayed and it is verified upon the URL and title.");
			} else {
				System.out.println("LoginPageAfterLogout title is found incorrect and it is verified");
				System.out.println(
						"Fail: LoginPageAfterLogout is not displayed and it is verified upon the URL and title.");
			}
		} else {
			System.out.println("LoginPageAfterLogout URL is found incorrect and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
}
}
