package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
//click(WebElement target )
//sendKeys(WebElement target, CharSequence...Keys)
//perform() 
//build()
public class ActitimeLoginByAction {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	//identify the username
	WebElement usernametextField = driver.findElement(By.id("username"));
	//password text field
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	//loginButton 
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	//create the object for Actions  class
	Actions actions = new Actions(driver);
	actions.sendKeys(usernametextField, "admin").sendKeys(passwordTextField, "manager").click(loginButton).build().perform();
	
}
}
