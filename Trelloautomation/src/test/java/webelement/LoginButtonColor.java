package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;

public class LoginButtonColor {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		//check the background-color
		String rgbbackgroundColor = loginButton.getCssValue("background-color");
		System.out.println(rgbbackgroundColor);
		String hexaColor = Color.fromString(rgbbackgroundColor).asHex();
		System.out.println(hexaColor);
		driver.manage().window().minimize();
		driver.quit();
	}
}
