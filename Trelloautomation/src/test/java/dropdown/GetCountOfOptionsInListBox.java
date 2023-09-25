package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetCountOfOptionsInListBox {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	//identify all the dropdowns in the webpage
	List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
	//iterate each drop down at a time
	System.out.println(allDropdowns.size());
	for (WebElement dropdown : allDropdowns) {
		//select only visible dropdowns in the UI
		if (dropdown.isDisplayed()) {
			Select dropdownSelect = new Select(dropdown);
			List<WebElement> allOptions = dropdownSelect.getOptions();
			System.out.println(allOptions.size());
			for (WebElement option : allOptions) {
				System.out.println(option.getText());
			}
		}
		
	}
	driver.manage().window().minimize();
	driver.quit();
}}
