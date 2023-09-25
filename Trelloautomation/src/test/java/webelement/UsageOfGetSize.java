package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//identify the usernametxtfild
	WebElement usernametextField = driver.findElement(By.id("username"));
	Dimension usernameSize = usernametextField.getSize();
	System.out.println(usernameSize);
	int usernameWidth = usernameSize.getWidth();
	System.out.println("usernameWidth = " + usernameWidth);
	int usernameHeight = usernameSize.getHeight();
	System.out.println("usernameHeight = " + usernameHeight);
	driver.manage().window().minimize();
	driver.quit();
}
}