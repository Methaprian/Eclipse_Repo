package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllignmentOfElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		Rectangle emailRect = emailTextField.getRect();
		int emailStartX = emailRect.getX();
		int emailStartY = emailRect.getY();
		int emailHeight = emailRect.getHeight();
		int emailWidth = emailRect.getWidth();
		int emailEndX = emailStartX+emailWidth;
		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
		Rectangle passwordRect = passwordTextField.getRect();
		int passwordStartX = passwordRect.getX();
		int passwordStartY = passwordRect.getY();
		int passwordHeight = passwordRect.getHeight();
		int passwordWidth = passwordRect.getWidth();
		int passwordEndX = passwordStartX+passwordWidth;
		System.out.println("-----------Left ALignment--------");
		System.out.println("emailStartX = " + emailStartX + " Pixels");
		System.out.println("passwordStartX = " + passwordStartX + " Pixels");
		if (emailStartX==passwordStartX) {
			System.out.println("Pass: The Left Alignment Of email and password text field is correct and verified.");
		}else {
			System.out.println("Fail: The Left Alignment of email and password text field is incorrect and verified.");
		}
		System.out.println("------------Right ALignment");
		System.out.println("emailEndX = " + emailEndX + " Pixels");
		System.out.println("passwordEndX = " + passwordEndX + " Pixels");
		if (emailEndX==passwordEndX) {
			System.out.println("Pass: The Right Alignment of email and password textfield is correct and verified.");
		}else {
			System.out.println("Fail: The right alignment of email and password textfield is incorrect and verified.");
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
