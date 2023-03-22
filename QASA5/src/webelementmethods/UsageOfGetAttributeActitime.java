package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfGetAttributeActitime {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/");
	String expectedUsernamePlaceholderText = "Username";
	System.out.println("expectedUsernamePlaceholderText = " + expectedUsernamePlaceholderText);
	WebElement usernameTextField = driver.findElement(By.id("username"));
	
	//getAttribute() - String - attValue - input - AttName 
	String actualUsernamePlaceholderText = usernameTextField.getAttribute("placeholder");
	System.out.println("actualUsernamePlaceholderText = " + actualUsernamePlaceholderText);
	//Check for the attribute value is empty or not
	if (actualUsernamePlaceholderText.isEmpty()) {
		System.out.println("Fail: Placeholder text is not present fot username textfield.");
	}else {
		//Check for the attribute value is correct or not
		if (expectedUsernamePlaceholderText.equals(actualUsernamePlaceholderText)) {
			System.out.println("Pass: PlaceHolder text of the username textfield is not empty and found correct upon verififcation ");
			}else {
				System.out.println("Fail: Placeholder text of the username textfield is not empty and found incorrect upon verification.");
			}
	}
	//Check for the textfield is empty Or not
	if(usernameTextField.getAttribute("value").isEmpty()) {
		System.out.println("Username textfield is empty.");
	}else {
		System.out.println("Username textfield is not empty.");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
