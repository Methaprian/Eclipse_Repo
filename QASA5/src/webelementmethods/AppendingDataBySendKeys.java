package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppendingDataBySendKeys {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		//clear()- precondition for sendKeys()- to append the data
		//Username text field is already filled with default text and in this situation
		//sendKeys() will append the fresh data without checking or considering the data which is already
		//present by default- appending the data(Problem)
		usernameTextField.sendKeys("admin");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("Test@123");
		WebElement signInButton = driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
		signInButton.submit();
		String expectedHomePageTitile = "Dashboard";
		String actualHomePageTitle = driver.getTitle();
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitile));
		if (expectedHomePageTitile.equals(actualHomePageTitle)) {
			System.out.println("Pass: The given User Credentials are Valid and Home page is Displayed and it is Verified upon it's Title.");
		}else {
			System.out.println("Fail: The The given User Credentials are Invalid and Home Page is not displayed and it is Verified upon it's Title. ");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
