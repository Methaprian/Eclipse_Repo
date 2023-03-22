package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IssueWithGetTextMethod {

	public static void main(String[] args) {	//Open Defect In Selenium Tool
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		WebElement mainTagText = driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/../td[not(@rowspan='2')]"));
		String actualMainTagText = mainTagText.getText();
		System.out.println("actualMainTagText "  + actualMainTagText);
		WebElement actualSubTagText = driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/../td[not(@rowspan='2')]/b"));
		String subTagText=actualSubTagText.getText();
		System.out.println("subTagText = " + subTagText);
		driver.manage().window().minimize();
		driver.quit();

	}

}
