package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLeftAndRightAlignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// identify the username
		Rectangle usernameRect = driver.findElement(By.id("email")).getRect();
		int usernameStartX = usernameRect.getX();
		System.out.println("usernameStartX = " + usernameStartX);
		int usernameWidth = usernameRect.getWidth();
		System.out.println("usernameWidth = " + usernameWidth);
		int usernameEndX = usernameStartX + usernameWidth;
		System.out.println("usernameEndX = " + usernameEndX);
		// identify the password text field
		Rectangle passwordRect = driver.findElement(By.id("passContainer")).getRect();
		int passwordStartX = passwordRect.getX();
		System.out.println("passwordStartX = " + passwordStartX);
		int passwordWidth = passwordRect.getWidth();
		System.out.println("passwordWidth = " + passwordWidth);
		int passwordEndX = passwordStartX + passwordWidth;
		System.out.println("passwordEndX = " + passwordEndX);
		if (usernameStartX == passwordStartX) {
			System.out.println(
					"Pass: The Left Alignment of Username and password textfield is found correct and it is verified.");
		} else {
			System.out.println(
					"Fail: The Left Alignment of Username and password textfield is found incorrect and it is verified.");
		}
		if (usernameEndX == passwordEndX) {
			System.out.println(
					"Pass: The Right Alignment of Username and password textfield is found correct and it is verified.");
		} else {
			System.out.println(
					"Fail: The Right Alignment of Username and password textfield is found incorrect and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
