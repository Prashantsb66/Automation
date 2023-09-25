package screenshot;

import java.io.File;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbScreenShot {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup/");

		WebElement link = driver.findElement(By.xpath("//a[text()='Already have an account?']"));

		File srcfile = link.getScreenshotAs(OutputType.FILE);

		File destinationfile = new File("errorshots/" + LocalDateTime.now().toString().replace(':', '-') + "fb.png");

		FileUtils.copyFile(srcfile, destinationfile);
		driver.quit();
	}
}
