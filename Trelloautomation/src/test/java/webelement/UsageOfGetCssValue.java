package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//find the login button
		WebElement loginButton = driver.findElement(By.name("login"));
		// get the background-color
		String bgColor = loginButton.getCssValue("background-color");
		System.out.println("background-color is : " + bgColor);
		//get the font-family
		String fontType = loginButton.getCssValue("font-family");
		System.out.println("font-family is: " + fontType);
		//get the font-weight
		String boldness = loginButton.getCssValue("font-weight");
		System.out.println("font-weight is : " + boldness );
		//get the font-size
		String fontSize = loginButton.getCssValue("font-size");
		System.out.println("font-size is : " + fontSize);
		driver.manage().window().minimize();
		driver.quit();
	}	
}
