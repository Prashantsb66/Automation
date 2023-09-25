package webelement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnabilityOfCheckBox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// identify the checkbox
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		// check for the enability - +ve
		if (keepLoggedInCheckBox.isEnabled()) {
			System.out.println("Boolean True - Pass - Positive");
			System.out.println("Pass: The keepLoggedInCheckBox is enabled and it is verified.");
		} else {
			System.out.println("Boolean False - Fail - Positive");
			System.out.println("Fail: The keepLoggedInCheckBox is disabled and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
