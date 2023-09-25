package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfIsEnabled {
	// Inappropriate behaviour of the isEnabled()
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		Thread.sleep(4000);
		WebElement zipFile = driver
				.findElement(By.xpath("//td[text()=' Oracle Solaris (x86 systems, 64-bit)']/..//a[text()=' ZIP']"));
		zipFile.click();
		Thread.sleep(4000);
		WebElement disabledButton = driver
				.findElement(By.xpath("//a[text()='Download SOLARIS.X64_195000_db_home.zip']"));
		if (disabledButton.isEnabled()) {
			System.out.println("Boolean True - Negative - Fail");
		} else {
			System.out.println("Boolean Flase - Negative - Pass");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
