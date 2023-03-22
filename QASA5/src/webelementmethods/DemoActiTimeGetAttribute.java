package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActiTimeGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		String expectedUserNamePlaceHolderText = "Username";
		System.out.println("expectedUserNamePlaceHolderText = "+ expectedUserNamePlaceHolderText);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		String actualUserNamePlaceHolderText = usernameTextField.getAttribute("placeholder");
		System.out.println("actualUserNamePlaceHolderText = "+ actualUserNamePlaceHolderText);
		if (actualUserNamePlaceHolderText.isEmpty()) {
			System.out.println("Fail: PlaceHolder Text is not present for the Username TextField.");
		}else {
			if (expectedUserNamePlaceHolderText.equals(actualUserNamePlaceHolderText)) {
				System.out.println("Pass: PlaceHolder text of the username textfield is not empty and found correct upon verififcation");
			}else {
				System.out.println("Fail: PlaceHolder text of the username textfield is not empty and found correct upon verififcation");
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
