package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsEnabledUponCheckBoxandRadio {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement publicApiRadioButtonLimit = driver.findElement(By.xpath("//label[contains(.,'(Without rate limit)')]/../input[@type='radio']"));
		if (publicApiRadioButtonLimit.isEnabled()) {
			System.out.println("Is publicApiRadioButtonLimit Enabled..??");
			System.out.println("+ve testing");
			System.out.println("isEnabled() is returning boolean true");
			publicApiRadioButtonLimit.click();
			if (publicApiRadioButtonLimit.isSelected()) {
				System.out.println("Is publicApiRadioButtonLimit Selected..??");
				System.out.println("+ve testing");
				System.out.println("isSelected() will return boolean true.");
				System.out.println("Pass: The Public API (without rate limit) is selected upon verifying it enability and verified it's selection");
			}else {
				System.out.println("Fail: The Public API(without rate limit) is not sleected upon verifying it enability and verified it's selection.");
			}
		}else {
			System.out.println("Fail: The Public API(without rate limit) is disabled and could not be selected.");
		}
		
		WebElement acceptTermsServiceButton = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
		//click() has the default scrolling ability to some extent.
		//It Has not specified in Selenium document
		acceptTermsServiceButton.click();
		WebElement acceptTermsServiceCheckBox = driver.findElement(By.id("confbtn"));
		wait.until(ExpectedConditions.visibilityOf(acceptTermsServiceCheckBox));
		if (acceptTermsServiceCheckBox.isEnabled()) {
			System.out.println("Is acceptTermsServiceCheckBox Enabled...?? ");
			System.out.println("+Ve testing ");
			System.out.println("isEnabled() is returning boolean true");
			acceptTermsServiceCheckBox.click();
			System.out.println("Pass: Please Accept Terms of Service CheckBox is enabled and selected upon verification.");
		}else {
			System.out.println("-ve testing");
			System.out.println("isEnabled() is returning boolean false.");
			System.out.println("Fail: Please Accept Terms of Service CheckBox is disabled and not selected upon verification.");
		}
		WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
		closeButton.click();
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		if (submitButton.isEnabled()) {
			System.out.println("Is SubmitButton Enabled..??");
			System.out.println("+ve Testing.");
			System.out.println("Pass: The Submit button is Enabled and it is verified.");
		}else {
			System.out.println("-Ve Testing.");
			System.out.println("Fail: The Submit button not Enabled and it is Verified.");
		}
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
