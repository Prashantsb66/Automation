package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTagLineText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement tagLine = driver.findElement(By.className("_8eso"));
		String actualTagLineText = tagLine.getText();
		System.out.println("actualTagLineText = " + actualTagLineText);
		String expectedTagLineText = "Facebook helps you connect and share with the people in your life.";
		System.out.println("expectedTagLineText = " + expectedTagLineText);
		if (actualTagLineText.equals(expectedTagLineText)) {
			System.out.println("Pass:The Tagline text is found correct and it is verified.");
		}else {
			System.out.println("Fail: The TagLine text is found incorrect and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}
}
