package webelementmethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewsKarnataka {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://newskarnataka.com/");
	WebElement facebookIcon = driver.findElement(By.xpath("//span[@class='nk_home_icn nk_home_icn_fb']"));
	facebookIcon.click();
	Set<String> allWindowsURL = driver.getWindowHandles();
	for (String win : allWindowsURL) {
		String actualUrl = driver.switchTo().window(win).getCurrentUrl();
		if (actualUrl.equals("https://www.facebook.com/newskarnataka/")) {
			WebElement sendMessageButton = driver.findElement(By.xpath("//div[@aria-label='Send Message']/..//span[text()='Send Message']"));
			sendMessageButton.click();
			WebElement popUpTitle = driver.findElement(By.xpath("//span[text()='See more on Facebook' and @class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xg8j3zb']"));
			if (popUpTitle.isDisplayed()) {
				System.out.println("Pass: The Send Message button in News Karnataka Home | Facebook Page is clicked and Verified upon popUpPage Title.");
				System.out.println("actualUrl = "+actualUrl);
			}else {
				System.out.println("Fail: The Send Message button in News Karnataka Home | Facebook Page is not clicked and it is Verified");
			}
		}
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
