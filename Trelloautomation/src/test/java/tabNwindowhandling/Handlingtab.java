package tabNwindowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtab {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://instagram.com");
		
		Set<String> allWh = driver.getWindowHandles();
		int count = allWh.size();
		System.out.println(count);
		for (String allTabs : allWh) {
			driver.switchTo().window(allTabs);
			System.out.println(allTabs);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}

}
