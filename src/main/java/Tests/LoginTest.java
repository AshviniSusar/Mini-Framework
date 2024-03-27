package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTest {
	private WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void loginWithValidCredentials() {
		driver.get("https://example.com");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterCredentials("username", "password");
		loginPage.clickLoginButton();

		// Perform assertions and verifications
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
