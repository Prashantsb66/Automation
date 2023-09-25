package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledButton {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		// identify the disabled submit button
		WebElement submitButton = driver.findElement(By.name("submit"));
		if (submitButton.isEnabled()) {
			System.out.println("Boolean True - Fail - Negative");
			System.out.println("Fail: The Submit button is enabled by default and it is verified.");
		} else {
			System.out.println("Boolean False - Pass  - Negative");
			System.out.println("Pass: The Submit button is disabled by default and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
