package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingObscuredElement {

	public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.get("https://www.amazon.com/");
			for(;;) {
			try {
				WebElement customerServiceInMenuBar = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Customer Service']"));
				customerServiceInMenuBar.click();
				if (wait.until(ExpectedConditions.titleIs("Amazon Customer Service Support – Amazon.com"))) {
					System.out.println("Pass: The Obscured Element is Handled without changing the Dynamics of the WebPage and it is Verified.");
					break;
				}else {
					System.out.println("Fail: The Obscured Element is Not handled and it is Verified.");
				}
				
			} catch (ElementClickInterceptedException e) {
				WebElement dontChangeAddress = driver.findElement(By.xpath("//span[contains(.,\"Don't Change\")]/../..//span[contains(@class,'button-dismiss')]//input[@type='submit']"));
				dontChangeAddress.click();
			}
			}
			driver.manage().window().minimize();
			driver.quit();
	}

}
