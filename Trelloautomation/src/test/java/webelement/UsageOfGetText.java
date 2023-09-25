package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgotPwdLinkText = driver.findElement(By.xpath("//a[contains(@href,'recover/initiate/?privacy_mutation')]"));
		String tagText = forgotPwdLinkText.getText();
		System.out.println("tagText = " + ">"+tagText+"<");
		driver.manage().window().minimize();
		driver.quit();
	}
}
