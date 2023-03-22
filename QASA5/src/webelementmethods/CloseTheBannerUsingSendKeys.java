package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBannerUsingSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		WebElement bannerCloseButton = driver.findElement(By.xpath("//span[text()='×']"));
		bannerCloseButton.click();
		driver.navigate().refresh();
		String seleniumPageSource = driver.getPageSource();
		if (seleniumPageSource.contains("class=\"close\"")) {
			System.out.println("Pass: The Selenium Conference Chichago 2023 Banner is Displayed and it is verified.");
		}
		else
		{
			System.out.println("Fail: The Selenium Conference Chichago 2023 Banner is not Displayed and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}

