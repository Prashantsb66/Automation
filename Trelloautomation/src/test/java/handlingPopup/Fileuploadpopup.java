package handlingPopup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Me/Desktop/naukari.html");
	Thread.sleep(3000);
	File f=new File("./src/test/resources/Prashant.Resume.pdf");
	String abspath = f.getAbsolutePath();
	Thread.sleep(3000);
	driver.findElement(By.id("CV")).sendKeys(abspath);
/*
   Filedownload popup is not displaying in the newer versions of any browser so need not to be handled
 
 */
	
}
}
