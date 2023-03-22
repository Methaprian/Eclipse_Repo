package admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAsAdmin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://122.166.192.191:9007/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		WebElement passwordTextField = driver.findElement(By.id("password"));
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(.,'Login')]"));
		String expectedHomePageTitle = "Admin Dashboard - Hospital Management System";
		if(emailTextField.isEnabled()) {
			emailTextField.sendKeys("admin@admin.com");
			if(passwordTextField.isEnabled()) {
				passwordTextField.sendKeys("admin@123");
				loginButton.submit();
				wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
				String actualHomePageTitle = driver.getTitle();
				if (expectedHomePageTitle.equals(actualHomePageTitle)) {
			+		System.out.println("Pass: The HomePage is Displayed upon Entering Valid Credentials and it is Verified.");
				}else {
					System.out.println("Fail: The HomePage is not Displayed upon Entering Valid Credentials and it is Verified.");
				}
			}else {
				System.out.println("Fail: The Password Text Field is NOT ENABLED and it is Verified.");
			}
		}else {
			System.out.println("Fail: The Email Text Field is not Enabled and it is Verified.");
		}
		driver.manage().window().minimize();
		driver.quit();		
	}

}
