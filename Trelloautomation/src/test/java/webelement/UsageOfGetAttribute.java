package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		//identify the checkbox
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		String toolTipText = keepLoggedInCheckBox.getAttribute("title");
		System.out.println("toolTipText = " + toolTipText);
		System.out.println(keepLoggedInCheckBox.getAttribute("type"));
		System.out.println(keepLoggedInCheckBox.getAttribute("value"));
		// attribute which not at all associated with the source code 
		System.out.println(keepLoggedInCheckBox.getAttribute("href"));
		//it will the return the null value
//		driver.manage().window().minimize();
//		driver.quit();
	}
}
