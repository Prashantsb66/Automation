package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalTestingAllOptionsOfAllListBox2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		List<WebElement> allDropDowns = driver.findElements(By.tagName("select"));
		for (WebElement dropdown : allDropDowns) {
			if (dropdown.isDisplayed()) {
				Select dropdownSelect = new Select(dropdown);
				List<WebElement> allOptions = dropdownSelect.getOptions();
				for (WebElement options : allOptions) {
					if (dropdown.getAttribute("title").equals("Day")) {
						dropdownSelect.selectByVisibleText(options.getText());
						if(options.isSelected())
						{
							System.out.println("Pass : "+ options.getText() + " is Selected.");
						}
						else {
							System.out.println("Pass : "+ options.getText() + " is not Selected.");
						}
						
					}
				}
			}
		}
		driver.quit();
	}
}
