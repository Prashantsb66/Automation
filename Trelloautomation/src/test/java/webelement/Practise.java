package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		 driver.findElement(By.xpath("//td[.='Maria Anders']/preceding::td/child::input")).click();
//		Actions a=new Actions(driver);
//		a.pause(1000).moveToElement(c).build().perform();
//		driver.quit();
	}
}
