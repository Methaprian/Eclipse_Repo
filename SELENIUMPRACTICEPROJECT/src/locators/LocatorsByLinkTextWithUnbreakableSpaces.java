package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByLinkTextWithUnbreakableSpaces {

		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tnpsc.gov.in/");
			Thread.sleep(5000);
			
			WebElement aboutUsTab = driver.findElement(By.linkText("ABOUT US"));
			aboutUsTab.click();
			Thread.sleep(5000);
			
			WebElement recruitmentTab = driver.findElement(By.linkText("Recruitment"));
			recruitmentTab.click();
			Thread.sleep(5000);
			
			driver.manage().window().minimize();
			driver.quit();
	}

}
