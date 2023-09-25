package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RcbImage {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.royalchallengers.com/");

		WebElement rcb = driver.findElement(By.xpath("//img[@src='/themes/custom/rcbbase/images/rcb-logo-new.png']"));

		File src = rcb.getScreenshotAs(OutputType.FILE);

		File permenentaddress = new File(
				"./errorshots/" + LocalDateTime.now().toString().replace(':', '-') + "rcblogo.png");

		FileUtils.copyFile(src, permenentaddress);

	}
}
