package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiss {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	   WebElement ts = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dsnation = new File("./errorshots/" + LocalDateTime.now().toString().replace(':', '-') + "fb.png");
		FileUtils.copyFile(src, dsnation);
		driver.quit();
	}
}
