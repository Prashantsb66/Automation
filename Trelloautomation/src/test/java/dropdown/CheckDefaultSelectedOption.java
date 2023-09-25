package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckDefaultSelectedOption {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDown);
		String selectedOption = monthSelect.getFirstSelectedOption().getText();
		System.out.println(selectedOption);
		String dayOption = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption().getText();
		System.out.println(dayOption);
		String yearOption = new Select(driver.findElement(By.id("year"))).getFirstSelectedOption().getText();
		System.out.println(yearOption);
		driver.manage().window().minimize();
		driver.quit();
	}
}
