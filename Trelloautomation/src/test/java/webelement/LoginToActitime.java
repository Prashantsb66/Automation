package webelement;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginToActitime {
	public WebDriver driver;
	@Test
	public void loginActitimeTest() throws Throwable {
		Properties pobj = new Properties();
		pobj.load(new FileInputStream("./src/test/resources/actitimedata.properties"));
		String browserName = pobj.getProperty("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get(pobj.getProperty("url"));
		// identify the username text field
		WebElement usernametextField = driver.findElement(By.id("username"));
		usernametextField.sendKeys(pobj.getProperty("username"));
		// identify the password text field
		WebElement passwordtextField = driver.findElement(By.name("pwd"));
		passwordtextField.sendKeys(pobj.getProperty("password"));
		// identify the login button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
}