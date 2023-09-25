package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreeenshot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.royalchallengers.com/");
		WebElement rcbLogo = driver.findElement(By.xpath("//img[contains(@src,'rcb-logo-new.png')]"));
		File srcFile = rcbLogo.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/"+LocalDateTime.now().toString().replace(':', '-')+"rcblogo.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.quit();
		
	}
}
