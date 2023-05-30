package create_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IsDisplayed {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=3afea702aba906b732c499bb7ed9f429d299db231eb024c36740a6163ccd4033");
	driver.findElement(By.xpath("//div[@class='modal-header text-center align-items-start']//button[@class='btn-close']"));
}
}
