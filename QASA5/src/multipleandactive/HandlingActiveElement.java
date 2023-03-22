package multipleandactive;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingActiveElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Selenium");
		List<WebElement> parentElement = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
		System.out.println(parentElement.size());
		for (WebElement autoSuggestion : parentElement) {
			List<WebElement> autoSuggestionsText = autoSuggestion.findElements(By.xpath("//div[@class='wM6W7d']/span"));
			//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
			for (WebElement autoText : autoSuggestionsText) {
				System.out.println(autoText.getText());   
			}	  
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}