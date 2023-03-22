package synchronization;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfPageLoadTimeOut {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(9));
		try {
			driver.get("https://www.amazon.in/");
			System.out.println("Pass: The WebPage has got loaded sucessfully.");
		} catch (TimeoutException e) {
			System.out.println("Fail: The WebPage has not loaded  sucessfully.");
		}
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
