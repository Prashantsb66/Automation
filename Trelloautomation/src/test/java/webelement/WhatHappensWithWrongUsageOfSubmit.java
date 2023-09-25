package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatHappensWithWrongUsageOfSubmit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	//UnsupportedOperationException - java - run - unchecked
	//Note: submit() can be called upon the <form> nested element
	loginButton.submit();
}
}