package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfGetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		Point emailLocation = emailTextField.getLocation();
		int emailStartX = emailLocation.getX();
		System.out.println("emailStartX = " + emailStartX + " Pixels");
		int emailStartY = emailLocation.getY();
		System.out.println("emailStartY = " + emailStartY + " Pixels");
		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
		Point passwordLocation = passwordTextField.getLocation();
		int passwordStartX = passwordLocation.getX();
		System.out.println("passwordStartX = " + passwordStartX + " Pixels");
		int passwordStartY = passwordLocation.getY();
		System.out.println("passwordStartY = " + passwordStartY + " Pixels");
		driver.manage().window().minimize();
		driver.quit();

	}

}
