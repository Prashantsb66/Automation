package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOnGetAttribuite {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("https://pib.gov.in/");
		} catch (WebDriverException e) {
			driver.navigate().refresh();
		}
		Thread.sleep(3000);
		//75 years of Independence
		WebElement azadi = driver.findElement(By.xpath("//a[@href='https://amritmahotsav.nic.in/']/img"));
		Thread.sleep(2000);
		String azadiTooltiptext = azadi.getAttribute("title");
//		 title-tooltip text
		System.out.println(azadiTooltiptext);
		Thread.sleep(2000);
		String azadiAlternativetext = azadi.getAttribute("alt");
//		alt-alternative text
		System.out.println(azadiAlternativetext);
		driver.quit();
	}
}
