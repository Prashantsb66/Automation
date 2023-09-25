 package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulationBySendkeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(0);
		// identify the username
		WebElement emailTextField = driver.findElement(By.id("email"));
		Thread.sleep(2000);
//		emailTextField.sendKeys("chandan.r@testyantra.com");
		//Tab 2 times + one time enter
//		emailTextField.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		emailTextField.sendKeys("selenium");
		Thread.sleep(2000);
		emailTextField.sendKeys(Keys.CONTROL+ "a");
		Thread.sleep(2000);
		emailTextField.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}
}