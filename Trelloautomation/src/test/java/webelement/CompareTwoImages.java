package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareTwoImages {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			driver.get("https://pib.gov.in/");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//identify the Azadi Ka Amrit Mahotsav Image
		WebElement azadi = driver.findElement(By.xpath("//a[@href='https://amritmahotsav.nic.in/']/img"));
		//identify the  G20 Image
		WebElement g20Image = driver.findElement(By.xpath("//a[@href='https://pib.gov.in/newsite/g20india.aspx']/img"));
		//get the image source  from src
		String azadiSource = azadi.getAttribute("src");
		System.out.println("azadiSource = " + azadiSource);
		String g20ImageSource = g20Image.getAttribute("src");
		System.out.println("g20ImageSource =  " + g20ImageSource);
		if (azadiSource.
				equals(g20ImageSource)) {
			System.out.println("Since Both the images source are same and the image will also remains same.");
		}else {
			System.out.println("Since both the image source is different and images are different from each other.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
