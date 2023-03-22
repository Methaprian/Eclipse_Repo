package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByClassNameWrongCondition {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.cowin.gov.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchButton = driver.findElement(By.className("searchBtn pin-search-btn district-search accessibility-plugin-ac"));
		searchButton.click();
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
