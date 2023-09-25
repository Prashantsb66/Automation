package Chandan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginLogout {
	public static void main(String[] args) {
		// Step 01: Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Step 02: Enter the URL
		driver.get("https://demo.actitime.com/");
		String expectedLoginPageTitle = "actiTIME - Login";
		System.out.println("expectedLoginPageTitle : " + expectedLoginPageTitle);
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("actualLoginPageTitle : " + actualLoginPageTitle);
		String expectedLoginPageUrl = "login.do";
		System.out.println("expectedLoginPageUrl : " + expectedLoginPageUrl);
		String actualLoginPageUrl = driver.getCurrentUrl();
		System.out.println("actualLoginPageUrl : " + actualLoginPageUrl);
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page title is found correct and it is verified.");
			if (actualLoginPageUrl.contains(expectedLoginPageUrl)) {
				System.out.println("Login Page URL is found correct and it is verified.");
				System.out.println("Login page is displayed upon the verification of title and URL.");
				// Step: 03 Enter the username
				WebElement usernametextField = driver.findElement(By.id("username"));
				usernametextField.clear();
				usernametextField.sendKeys("admin");
				// Step 04: Enter the password
				WebElement passwordTextField = driver.findElement(By.name("pwd"));
				passwordTextField.clear();
				passwordTextField.sendKeys("manager");
				// Step 05: Click on Login Button
				WebElement loginButton = driver.findElement(By.id("loginButton"));
				loginButton.click();
				String expectedHomePageTitle = "actiTIME - Enter Time-Track";
				System.out.println("expectedHomePageTitle : " + expectedHomePageTitle);
				String actualHomepageTitle = driver.getTitle();
				System.out.println("actualHomepageTitle : " + actualHomepageTitle);
				if (actualHomepageTitle.equals(expectedHomePageTitle)) {
					System.out.println("The Homepage title is found correct and it is verified.");
					String expectedHomePageUrl = "user/submit_tt.do";
					System.out.println("expectedHomePageUrl : " + expectedHomePageUrl);
					String actualHomePageUrl = driver.getCurrentUrl();
					System.out.println("actualHomePageUrl : " + actualHomePageUrl);
					if (actualHomePageUrl.contains(expectedHomePageUrl)) {
						System.out.println("The Homepage URL is found correct and it is verified.");
						WebElement logoutOption = driver.findElement(By.id("logoutLink"));
						if (logoutOption.isDisplayed()) {
							System.out.println("The HomePage Logout option is displayed and it is verified.");
							System.out.println("The HomePage is displayed");
							// Step 06: Click on Logout option
							logoutOption.click();
							if (driver.getTitle().equals(expectedLoginPageTitle)) {
								System.out
										.println("Login page title is found correct after logout and it is verified.");
								if (driver.getCurrentUrl().contains(expectedLoginPageUrl)) {
									System.out.println(
											"Login page URL is found correct after logout and it is verified.");
								} else {
									System.out.println(
											"Login page is not displayed after logout since URL found incorrect and it is verified.");
								}
							} else {
								System.out.println(
										"Login page is not displayed since after logout title found incorrect and it is verified.");
							}
						} else {
							System.out.println(
									"The Homepage is not displayed since the logout option is invisible and it is verified.");
						}
					} else {
						System.out.println(
								"The HomePage is not displayed since the URL is incorrect and it is verified.");
					}
				} else {
					System.out
							.println("The HomePage is not displayed since the title is incorrect and it is verified.");
				}

			} else {
				System.out.println("Login page is not displayed since URL is incorrect and it is verified");
			}
		} else {
			System.out.println("Login page is not displayed since title is incorrect and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}