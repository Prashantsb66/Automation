package Chandan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//When not to go for class as the locator
public class ProblemWithClassLoctaor {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//InvalidSelectorException - Selenium - run - unchecked 
		//when the class attribute contains space in it's value
		driver.findElement(By.className("fb_content clearfix "));
		driver.manage().window().minimize();
		driver.quit();
	}
}
