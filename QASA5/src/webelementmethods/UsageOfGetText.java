package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfGetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		String expectedFacebookTagLineText = "Facebook helps you connect and share with the people in your life.";
		System.out.println("expectedFacebookTagLineText = " + expectedFacebookTagLineText);
		WebElement facebookTagLine = driver.findElement(By.className("_8eso"));
		String actualFacebookTagLineText = facebookTagLine.getText();
		System.out.println("actualFacebookTagLineText = " + actualFacebookTagLineText );
		if (expectedFacebookTagLineText.equals(actualFacebookTagLineText)) {
			System.out.println("Pass: The TagLine text is found correct upon verification.");
		}else {
			System.out.println("Fail: The TagLine text is found incorrect upon verification.");
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
