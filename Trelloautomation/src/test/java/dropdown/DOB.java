package dropdown;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DOB {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		// identify all the dropdowns in the Web page
		List<WebElement> allDropDowns = driver.findElements(By.tagName("select"));
		int countOfDropDown = allDropDowns.size();
		System.out.println("countOfDropDown " + countOfDropDown);
		// iterate the dropdowns
		for (WebElement dropdown : allDropDowns) {
			// select the visible one.
			if (dropdown.isDisplayed()) {
				Select dropdownSelect = new Select(dropdown);
				if (dropdown.getAttribute("title").equals("Day")) {
					//selectByIndex(int optionCountIndexValue)
//					dropdownSelect.selectByIndex(22);
					//selectByVisibleText(String visibleText/OptiontagText)
					dropdownSelect.selectByVisibleText("23");
				} else if (dropdown.getAttribute("title").equals("Month")) {
//					dropdownSelect.selectByIndex(9);
					dropdownSelect.selectByVisibleText("Oct");
				} else if (dropdown.getAttribute("title").equals("Year")) {
					dropdownSelect.selectByVisibleText("1979");
					//selectByvalue(String valueAttValue)
//					dropdownSelect.selectByValue("1979");
				}
			}
		}
	}
}