package screenshot;


import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenShot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kids.nationalgeographic.com/animals");
		//Explicit Type Casting
		TakesScreenshot	ts=(TakesScreenshot)driver;
		File tempAddress = ts.getScreenshotAs(OutputType.FILE);
		String address = tempAddress.getAbsolutePath();
		System.out.println(address);
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		File permanentAddress = new File("./errorshots/"+timeStamp+"animals.png");
		//screenshot will be auto deleted
		FileUtils.copyFile(tempAddress, permanentAddress);     
//		Thread.sleep(20000);
		driver.quit();}}