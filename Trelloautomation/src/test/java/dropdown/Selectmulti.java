package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmulti {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		List<WebElement> allselect = driver.findElements(By.tagName("select"));
		for (WebElement select : allselect) {
			if (select.isDisplayed()) {
				Select s = new Select(select);
				List<WebElement> options = s.getOptions();
				for (WebElement option : options) 
				{
				if(select.getAttribute("title").equals("Day"))
				{
					s.selectByVisibleText("29");
					}
				else if(select.getAttribute("title").equals("Month"))
				{
					s.selectByVisibleText("Jul");}
				else if(select.getAttribute("title").equals("Year"))
				{
					s.selectByVisibleText("1998");}

				}
			}
		}
		driver.quit();
	}
}
