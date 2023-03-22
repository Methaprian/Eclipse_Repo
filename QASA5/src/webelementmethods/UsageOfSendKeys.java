package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfSendKeys {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("jshbvjhsdbv");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		usernameTextField.sendKeys("admin");
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		passwordTextField.sendKeys("manager");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.sendKeys(Keys.ENTER);
		if(wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"))) {
			System.out.println("Pass: The Home Page is Displayed Upon entering Valid Credentials Using SendKeys and it is Verified upon its Title.");
		}else {
			System.out.println("Fail: The Home Page is not Displayed Upon entering Valid Credentials Using SendKeys and it is Verified upon its Title.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
