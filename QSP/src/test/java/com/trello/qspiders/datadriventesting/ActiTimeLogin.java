package com.trello.qspiders.datadriventesting;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLogin {
	
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable, Throwable {
		Properties pobj=new Properties();
		pobj.load(new FileInputStream("./src/test/resources/actitimecommondata.properties"));
		String browserName = pobj.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions action=new Actions(driver);
		driver.get(pobj.getProperty("url"));
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(pobj.getProperty("username"));
		
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(pobj.getProperty("password"));
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		action.click(loginButton);
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHoemPageTitle = driver.getTitle();
		
		if (expectedHomePageTitle.equals(actualHoemPageTitle)) {
			driver.manage().window().minimize();
			driver.quit();
		}
	}
}
