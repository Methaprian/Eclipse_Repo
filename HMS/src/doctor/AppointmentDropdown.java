package doctor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppointmentDropdown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://122.166.192.191:9007/");
		Actions actions = new Actions(driver);
		WebElement emailTextField = driver.findElement(By.id("email"));
		WebElement passwordTextField = driver.findElement(By.id("password"));
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(.,'Login')]"));
		String expectedHomePageTitle = "Doctor Dashboard - Hospital Management System";
		String expectedAppointmentPageTitle = "Appointment - Hospital Management System";
		if(emailTextField.isEnabled()) {
			Thread.sleep(1000);
			emailTextField.sendKeys("draadithyavarma@gmail.com");
			if(passwordTextField.isEnabled()) {
				Thread.sleep(1000);
				passwordTextField.sendKeys("123456789*");
				Thread.sleep(1500);
				loginButton.submit();
				wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
				String actualHomePageTitle = driver.getTitle();
				if (expectedHomePageTitle.equals(actualHomePageTitle)) {
					System.out.println("Pass: The HomePage is Displayed upon Entering Valid Credentials and it is Verified.");
					WebElement appointmentDropment = driver.findElement(By.xpath("//a/span[text()='Appointment']"));
					Thread.sleep(2000);
					appointmentDropment.click();	// This click is to Expand the appointmentDropdown since the element is not dynamic.
					WebElement appointmentListOption1 = driver.findElement(By.xpath("//a/span[text()='Appointment List']"));
					Thread.sleep(2000);
					appointmentListOption1.click();	// This Click is to Open the Appointment List page.
					wait.until(ExpectedConditions.titleIs(expectedAppointmentPageTitle));
					String actualAppointmentPageTitle = driver.getTitle();
					if (expectedAppointmentPageTitle.equals(actualAppointmentPageTitle)) {
						System.out.println("Pass: The Appointment List Page is Displayed Upon Verifiaction of Title of the page.");
					}else {
						System.out.println("Fail: The Appointment List Page is not Displayed and it is Verifed upon its Title.");
					}
					
				}else {
					System.out.println("Fail: The HomePage is not Displayed upon Entering Valid Credentials and it is Verified.");
				}
			}else {
				System.out.println("Fail: The Password Text Field is NOT ENABLED and it is Verified.");
			}
		}else {
			System.out.println("Fail: The Email Text Field is not Enabled and it is Verified.");
		}
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
