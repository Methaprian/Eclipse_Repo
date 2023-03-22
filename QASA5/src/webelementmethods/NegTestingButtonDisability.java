package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NegTestingButtonDisability {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		//-ve functionality testing upon a submit button whether it is functionally disabled or not 
		WebElement submitButton = driver.findElement(By.name("submit"));
		if (submitButton.isEnabled()) {
			System.out.println("+ve testing will Be validated here.");
			System.out.println("isEnabled() is returning boolean true");
			System.out.println("Fail: The submit button is enabled without selecting the checkbox and it is verified.");
		}else {
			System.out.println("-Ve testing will be validated here.");
			System.out.println("isEnabled() is returning boolean false");
			System.out.println("Pass: The Submit button is disabled without selecting the checkbox and it is verified. ");
		}
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
