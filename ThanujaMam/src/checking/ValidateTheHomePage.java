package checking;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateTheHomePage {
	public static void main(String[] args) {
		// Step 01: Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// Step 02: Enter the main URL of the application
		driver.get("https://demo.actitime.com/");
		String actualLoginPageUrl = driver.getCurrentUrl();
		System.out.println("actualLoginPageUrl = " + actualLoginPageUrl);
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("actualLoginPageTitle = " + actualLoginPageTitle);
		String expectedLoginPageUrl = "https://demo.actitime.com/login.do";
		System.out.println("expectedLoginPageUrl = " + expectedLoginPageUrl);
		String expectedLoginPageTitle = "actiTIME - Login";
		System.out.println("expectedLoginPageTitle = " + expectedLoginPageTitle);
		if (actualLoginPageUrl.equals(expectedLoginPageUrl)) {
			System.out.println("LoginPage URL is found correct and it is verified");
			if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
				System.out.println("LoginPage title is found correct and it is verified");
				System.out.println("Pass: Login page is displayed and it is verified upon the URL and title.");
			} else {
				System.out.println("LoginPage title is found incorrect and it is verified");
				System.out.println("Fail: Login page is not displayed and it is verified upon the URL and title.");
			}
		} else {
			System.out.println("Loginpage URL is found incorrect and it is verified.");
		}
		// Step 03:Enter the valid username
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("admin");
		// Step 04: Enter the valid password
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys("manager");
		// Step 05: Click on Login Button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		String expectedHomePageUrl = "https://demo.actitime.com/user/submit_tt.do";
		System.out.println("expectedHomePageUrl = " + expectedHomePageUrl);
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		System.out.println("expectedHomePageTitle = " + expectedHomePageTitle);
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		if (wait.until(ExpectedConditions.urlToBe(expectedHomePageUrl))) {
			String actaulHomePageUrl = driver.getCurrentUrl();
			System.out.println("actaulHomePageUrl = " + actaulHomePageUrl);
			System.out.println("Home Page URL is found correct and it is verified.");
			if (wait.until(ExpectedConditions.titleIs(expectedHomePageTitle))) {
				String actualHomePageTitle = driver.getTitle();
				System.out.println("actualHomePageTitle = " + actualHomePageTitle);
				System.out.println("Home Page Title is found correct and it is verified.");
				if (logoutLink.isDisplayed()) {
					System.out.println("Home Page logout option is displayed and it is verified.");
					System.out.println("Pass: The Home Page is displayed.");
				} else {
					System.out.println("Home Page logout option is not displayed and it is verified.");
					System.out.println("Fail: The Home Page is not displayed.");
				}
			} else {
				System.out.println("Home page title is found incorrect and it is verified.");
			}
		} else {
			System.out.println("Home Page URL id found incorrect and it is verified.");
		}

		// Step 06: Click on Logout Option
		logoutLink.click();
		String actualLoginPageUrlAfterLogout = driver.getCurrentUrl();
		System.out.println("actualLoginPageUrlAfterLogout = " + actualLoginPageUrlAfterLogout);
		String actualLoginPageTitleAfterLogout = driver.getTitle();
		System.out.println("actualLoginPageTitleAfterLogout = " + actualLoginPageTitleAfterLogout);
		if (actualLoginPageUrlAfterLogout.equals(expectedLoginPageUrl)) {
			System.out.println("LoginPageAfterLogout URL is found correct and it is verified");
			if (actualLoginPageTitleAfterLogout.equals(expectedLoginPageTitle)) {
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