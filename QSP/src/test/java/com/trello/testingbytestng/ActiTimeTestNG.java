package com.trello.testingbytestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiTimeTestNG {

	public static WebDriver driver;
	@BeforeClass
	public void preConditionForAll() {
		//Set the Driver Executable Path
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		//Instantiate the Browser Specific Class
		driver=new ChromeDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Supply the Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Pre-Condition Execution");
	}
	@BeforeMethod
	public void preConditionForTest() throws Throwable {
		driver.get("https://demo.actitime.com/");
		WebElement usernameTF = driver.findElement(By.id("username"));
		usernameTF.clear();
		usernameTF.sendKeys("admin");
		WebElement passwordTF = driver.findElement(By.name("pwd"));
		passwordTF.clear();
		passwordTF.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(5000);
		System.out.println("preConditionForTest");
	}
	@Test
	public void testScript() {
		WebElement taskTab = driver.findElement(By.cssSelector("a[href='/tasks/tasklist.do']"));
		taskTab.click();
		WebElement reportsTab = driver.findElement(By.cssSelector("a[href='/reports/reports.do']"));
		reportsTab.click();
		WebElement usersTab = driver.findElement(By.cssSelector("a[href='/administration/userlist.do']"));
		usersTab.click();
		System.out.println("testScript");
	}
	@AfterMethod
	public void postConditionForTest() {
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		logoutLink.click();
		System.out.println("postConditionForTest");
	}
	@AfterClass
	public void postConditionForAll() {
		driver.manage().window().minimize();
		driver.quit();
		System.out.println("postConditionForAll");
	}
}