package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptinessOfThetextField {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernametextField = driver.findElement(By.id("username"));
		//att is there but it will not carry any value
		String valueAttvalue = usernametextField.getAttribute("value");
		System.out.println(valueAttvalue);
		if (valueAttvalue.isEmpty()) {
			System.out.println("Boolean True");
			System.out.println("The Attribute value is empty String");
		}else {
			System.out.println("Boolean False");
			System.out.println("The Attribute Value is not an empty string");
		}
		driver.manage().window().minimize();
//		driver.quit();
	}}
