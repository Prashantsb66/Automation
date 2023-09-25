package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practis {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		List<WebElement> dropdowns = driver.findElements(By.tagName("select"));
		for (WebElement dropdown : dropdowns) {

			Select dropdownslct = new Select(dropdown);
		System.out.println(dropdownslct.getFirstSelectedOption().getText() );	
			List<WebElement> options = dropdownslct.getOptions();
			for (WebElement option : options) {
				l.add(option.getText());
			}
		}
		System.out.println(l);
		driver.quit();
	}
}
