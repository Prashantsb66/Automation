package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocation {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.actitime.com/login.do");
	 //identify the username textfield
	 WebElement usernametexrtField = driver.findElement(By.id("username"));
	 //get the location of username textfield on the webpage
	 Point usernameLocation = usernametexrtField.getLocation();
	 System.out.println("usernameLocation = " + usernameLocation );
	 int usernameStartX = usernameLocation.getX();
	 System.out.println("usernameStartX = " + usernameStartX);
	 int usernameStartY = usernameLocation.getY();
	 System.out.println("usernameStartY = " + usernameStartY);	 
	 driver.manage().window().minimize();
	 driver.quit();
}
}
