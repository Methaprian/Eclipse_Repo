package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLogoutVTiger_01 {

	public static void main(String[] args) {
		//Step 01: Open the Browser- Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Step 02: Trigger the Main URL of the application - VTiger
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//Step 03: Enter the Username - admin
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys("admin");
		//Step 04: Enter the  Password - Test@123
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("Test@123");
		//Step 05: Click on Submit Button
		WebElement submitButton = driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
		submitButton.submit();
		wait.until(ExpectedConditions.titleIs("Dashboard"));
		String expectedHomePageTitile = "Dashboard";
		String actualHomePageTitle = driver.getTitle();
		WebElement logOutOption = driver.findElement(By.xpath("//a[@role='button']"));
		logOutOption.click();
		WebElement signOutOption = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		signOutOption.click();
		if (expectedHomePageTitile.equals(actualHomePageTitle)) {
			System.out.println("Pass: The given User Credentials are Valid and Home page is Displayed and it is Verified upon it's Title.");
		}else {
			System.out.println("Fail: The The given User Credentials are Invalid and Home Page is not displayed and it is Verified upon it's Title. ");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
