package Chandan;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckTheLocation {
public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Point usernameLocation = driver.findElement(By.id("email")).getLocation();
	System.out.println(usernameLocation.getX());
	System.out.println(usernameLocation.getY());
	System.out.println("usernameLocation = " + usernameLocation);
	Point passwordLocation = driver.findElement(By.id("passContainer")).getLocation();
	System.out.println("passwordLocation  = "+ passwordLocation);
	driver.manage().window().minimize();
	
	driver.quit();
}
}
