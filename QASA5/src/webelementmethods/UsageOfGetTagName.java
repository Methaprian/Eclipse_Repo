package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfGetTagName {

	public static void main(String[] args) throws Throwable {
		//Set The driver execuatble path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate The browser specific class 
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Synchronization - Implicit and Explicit Wait Declarations
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//pass the main URL 
		driver.get("https://demo.actitime.com/");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		if (usernameTextField.getTagName().equals("input")) {
			System.out.println("Boolean True");
			System.out.println("Pass: The USername text field element tagname is correct and verified.");
			usernameTextField.clear();
			usernameTextField.sendKeys("admin");
		}else {
			System.out.println("boolean false");
			System.out.println("Fail: The username text field element tagname Is incorrect and verified.");
		}
		WebElement keepMeLoggedInCheckbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if (keepMeLoggedInCheckbox.getTagName().equals("input")) {
			System.out.println("Boolean True");
			System.out.println("Pass: The Check Box tagname Is correct and verified.");
			keepMeLoggedInCheckbox.click();
		}else {
			System.out.println("Boolean False");
			System.out.println("Fail: The checkbox tagname is incorrect and verified");
		}
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		if (loginButton.getTagName().equals("button")) {
			System.out.println("Boolean true");
			System.out.println("Pass: Button TagName is correct and it is verified");
			loginButton.click();
		}else {
			System.out.println("boolean false");
			System.out.println("Fail: Button tagname Is incorrect and it is verified and action will not Be performed on the element.");
		}
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
