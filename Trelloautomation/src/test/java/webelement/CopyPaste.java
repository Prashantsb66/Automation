package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//identify the username
	WebElement emailtextField = driver.findElement(By.id("email"));
	//identify the password
	WebElement password = driver.findElement(By.id("pass"));
	//Enter the data to emailtetfield 
	Thread.sleep(2000);
	emailtextField.sendKeys("selenium");
	Thread.sleep(2000);
	//select all the data in the email textfield
	emailtextField.sendKeys(Keys.CONTROL+"a");
	//cut all the data in email text field
	Thread.sleep(2000);
	emailtextField.sendKeys(Keys.CONTROL+"x");
	Thread.sleep(2000);
	//paste the data to the password text field
	password.sendKeys(Keys.CONTROL+"v");
}
}