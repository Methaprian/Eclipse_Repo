package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttributeMethod {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement closeButton = driver.findElement(By.className("_2KpZ6l _2doB4z"));
	closeButton.click();
	WebElement flipkartLogo = driver.findElement(By.className("_2xm1JU"));
	String alternateNameToolTip = flipkartLogo.getAttribute("alt");
	System.out.println("alternateNameToolTip = " + alternateNameToolTip);
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
}
}
