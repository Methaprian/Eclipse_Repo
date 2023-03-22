package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfClick {
public static void main(String[] args) {
	//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//pass the main URL of the application 
		driver.get("https://www.facebook.com/signup");
		//find the Male radio button and click
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
		maleRadioButton.click();
		//Identify the Sign up button and click.
		WebElement signupButton = driver.findElement(By.name("websubmit"));
		//signupButton.sendKeys(Keys.ENTER);
		signupButton.click();
		driver.manage().window().minimize();
		driver.quit();

}
}
