package Chandan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraoblemWithGetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement divTag = driver.findElement(By.className("_8esl"));
		String divTagName = divTag.getTagName();
		System.out.println(divTagName);
		String divTagText = divTag.getText(); 
		//here the <div> has no tag text
		System.out.println("<"+divTagName+">"+divTagText+"<"+divTagName+">");
		//=====================================================================
		System.out.println("=================================================================");
		WebElement actualtag = driver.findElement(By.className("_8eso"));
		String actualTagName = actualtag.getTagName();
		System.out.println(actualTagName);
		String actualtagText = actualtag.getText();
		//here the <div> has no tag text
		System.out.println("<"+actualTagName+">"+actualtagText+"<"+actualTagName+">");
		driver.manage().window().minimize();
		driver.quit();
	}
}