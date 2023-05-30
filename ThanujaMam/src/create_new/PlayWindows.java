package create_new;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class PlayWindows {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		String fbTitle = driver.getTitle();
		System.out.println("fbTitle = " + fbTitle);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demo.actitime.com/login.do");
		String actitimeTitle = driver.getTitle();
		System.out.println("actitimeTitle = " + actitimeTitle);
		Set<String> allWidID = driver.getWindowHandles();
		for (String wid : allWidID) {
			System.out.println(allWidID);
			String randomTitle = driver.switchTo().window(wid).getTitle();
			if (randomTitle.equals(fbTitle)) {
				driver.close();
			} else if (randomTitle.equals(actitimeTitle)) {
				Dimension sizeOfActitime = driver.manage().window().getSize();
				int height = sizeOfActitime.getHeight();
				System.out.println("height = " + height);
				int width = sizeOfActitime.getWidth();
				System.out.println("width = " + width);
				Dimension definedSize = new Dimension(100, 300);
				driver.manage().window().setSize(definedSize);
				{

				}
			}
		}
	}
}
