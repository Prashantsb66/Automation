package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
		if (maleRadioButton.isSelected()) {
			// Before we selected it has got already selected by default
			System.out.println("Pass");
		} else {
			// before we select it is has not selected upon that confirmation we are moving
			// ahead to select
			System.out.println("Fail");
			// select the male radio button since it has not been selected
			maleRadioButton.click();
			// verify that the male radio button has been selected after the selection or
			// not
			if (maleRadioButton.isSelected()) {
				System.out.println("Boolean True - Selected  +ve - Pass");
				System.out.println("Pass: The Male Radio Button isSelected and it is verified.");
			} else {
				System.out.println("Boolean False - not Selected - +ve - Fail");
				System.out
						.println("Fail: The Male Radio button is not selected  even after clicking and it is verified");
			}
			driver.manage().window().minimize();
			driver.quit();
		}
	}
}
