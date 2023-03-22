package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IssueWithIsEnabled {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
	WebElement oracleSolarisFileZip = driver.findElement(By.xpath("//td[text()=' Oracle Solaris (x86 systems, 64-bit)']/..//a[contains(@data-file,'/solaris/oracle19c/')]"));
	oracleSolarisFileZip.click();
	WebElement acceptLicenseCheckBox = driver.findElement(By.xpath("//a[.='Download SOLARIS.X64_195000_db_home.zip']/ancestor::form//input[@name='licenseAccept']"));
	acceptLicenseCheckBox.click();
	//isEnabled() can be called upon <input> and <button> only.
	//if we call upon any other tag then it will behave inappropriately and it will return boolean true always.
	WebElement downloadButton = driver.findElement(By.xpath("//a[.='Download SOLARIS.X64_195000_db_home.zip']"));
	Thread.sleep(2000);
	if (downloadButton.isEnabled()) {
		System.out.println("+ve testing");
		System.out.println("isEnabled() is returning Boolean True");
		System.out.println("Fail: DownLoad button is enabled");
	}else {
		System.out.println("-ve Testing");
		System.out.println("isEnabled() is returning boolean false.");
		System.out.println("Pass: Download button is disabled");
	}
	driver.manage().window().minimize();
	driver.quit();

}
}
