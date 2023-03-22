package webelementmethods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTHeObscuredElementInAmazon {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		WebElement clickDontChangeButton = driver.findElement(By.xpath("//span[contains(@class,'button-dismiss')]//input[@type='submit']"));
		clickDontChangeButton.click();
		WebElement customerServiceButton = driver.findElement(By.xpath("//div[@id='nav-xshop']//a[text()='Customer Service']"));
		customerServiceButton.click();
		String expectedPageTitle = "Amazon Customer Service Support – Amazon.com";
		System.out.println("expectedPageTitle = " +expectedPageTitle);
		String actualPageTitle=driver.getTitle();
		if (expectedPageTitle.equals(actualPageTitle)) {
			System.out.println("Pass: The Customer Service Page is Displayed upon clicking Customer Service Link and it is Verified.");
		}else {
			System.out.println("Fail: The Customer Service Page is not Displayed upon clicking Customer Service Link and it is Verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
