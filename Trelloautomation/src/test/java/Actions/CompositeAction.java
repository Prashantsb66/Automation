package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
//moveToElement(WebElement target, int xOffset,int yOffset)
//pause(long pause)
public class CompositeAction {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	WebElement menSection = driver.findElement(By.xpath("//a[@class='desktop-main' and text()='Men']"));
//	List<WebElement> allMenuOptions = driver.findElements(By.className("desktop-main"));
	Actions actions = new Actions(driver);
//	for (WebElement option : allMenuOptions) {
//		actions.moveToElement(option).pause(2000).perform();
//	}
	actions.moveToElement(menSection).pause(2000).moveToElement(menSection,73 , 0).pause(2000).moveToElement(menSection,148, 0).pause(2000).moveToElement(menSection,245, 0).pause(2000).moveToElement(menSection,353, 0).pause(2000).moveToElement(menSection,438, 0).build().perform();
	
}
}