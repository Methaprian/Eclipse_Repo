package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByLinkTextUnbreakableSpaces {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://afmc.nic.in/");
		
		WebElement aboutAfmcMenu = driver.findElement(By.linkText("About AFMC"));
		aboutAfmcMenu.click();
		
		WebElement admissionMenu = driver.findElement(By.linkText("Admission"));
		admissionMenu.click();
		
		WebElement departmentMenu = driver.findElement(By.linkText("Departments"));
		departmentMenu.click();
		driver.navigate().back();
		
		WebElement coursesMenu = driver.findElement(By.linkText("Courses"));
		coursesMenu.click();
		
		WebElement researchMenu = driver.findElement(By.linkText("Research"));
		researchMenu.click();
		
		WebElement administrationMenu = driver.findElement(By.linkText("Administration"));
		administrationMenu.click();
		
		WebElement mjafiPage = driver.findElement(By.linkText("MJAFI"));
		mjafiPage.click();
		driver.navigate().back();
		
		WebElement covidBulletinMenu = driver.findElement(By.linkText("COVID BULLETIN"));
		covidBulletinMenu.click();
		driver.navigate().back();
		
		WebElement muhsMandateMenu = driver.findElement(By.linkText("MUHS Mandate"));
		muhsMandateMenu.click();
		
		WebElement naacMenu = driver.findElement(By.linkText("NAAC"));
		naacMenu.click();
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
