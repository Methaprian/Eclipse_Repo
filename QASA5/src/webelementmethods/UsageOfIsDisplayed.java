package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfIsDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement acceptTermsServiceButton = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
		acceptTermsServiceButton.click();
		WebElement pleaseAcceptTermsCheckBox = driver.findElement(By.id("confbtn"));
		//in the DOM the element source code should be there - pre condition for isDisplayed()
		if (pleaseAcceptTermsCheckBox.isDisplayed()) {
			System.out.println("+ve testing");
			System.out.println("isDisplayed() is returning boolean true.");
			System.out.println("Fail: Please Accept Terms of Service CheckBox is displayed before even clicking On Accept Terms of Service Button.");
		}else {
			System.out.println("-ve testing");
			System.out.println("isDisplayed() is returning boolean false");
			System.out.println("Pass: Please Accept Terms of Service CheckBox is not displayed without clicking the Accept terms of Service button.");
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
