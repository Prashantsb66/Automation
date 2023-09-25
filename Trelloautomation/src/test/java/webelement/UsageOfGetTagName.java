package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//identify the login button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		// click only if it is made with button
		String tagName = loginButton.getTagName();
		System.out.println("<"+tagName+">");
		if (tagName.equals("button")) {
			loginButton.click();
		}else {
			System.out.println("The login button is not made with <button> tag");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
