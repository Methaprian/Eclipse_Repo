package com.trello.qspiders.datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLogOut {

	public static void main(String[] args) {
		//Set the Driver Executable Path
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		//Instantiate the Browser Specific Class
		WebDriver driver=new ChromeDriver();
		//- PRE-CONDITIONS 
		//Maximize the Browser
		driver.manage().window().maximize();
		//Provide the Implicit Wait and Explicit Wait
		//These following Steps will provide the necessary waiting time.
		//Implicit Wait ----> provides time for findElement() and findElements() method.
		//Explicit Wait Provides Wait time based on the Condition Passed.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Pass the Mail URL of the Application Under Testing
		driver.get("https://trello.com/");
		//Click on the Login Option
		String welcomePageTitle="Manage Your Team’s Projects From Anywhere | Trello";
		wait.until(ExpectedConditions.titleIs(welcomePageTitle));
		driver.findElement(By.xpath("//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[text()='Log in']")).click();
		//Pass the Test Case Mail ID
		WebElement usernameTextField = driver.findElement(By.id("user"));
		usernameTextField.clear();
		usernameTextField.sendKeys("metha5prian@gmail.com");
		//Click on Continue Button
		driver.findElement(By.id("login")).click();
		//Pass the Test Case Password
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		WebElement passwordTextfield = driver.findElement(By.id("password"));
		passwordTextfield.sendKeys("5Nov1996*");
		//Click on the Login Button
		//Here we are not using submit() because the <button> tag is not present in the <form> tag.
		// So we are using click() method.
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		loginButton.click();
		String expectedHomePageTitle = "Boards | Trello";
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle = driver.getTitle();
		if (expectedHomePageTitle.equals(actualHomePageTitle)) {
			//Identify The Profile Icon and Click on it.
			WebElement profileIcon = driver.findElement(By.className("yRPuNUIoZpQWwj"));
			profileIcon.click();
			//Identify and Click on Logout Option
			WebElement logoutOption = driver.findElement(By.xpath("//span[text()='Log out']"));
			logoutOption.click();
			driver.findElement(By.xpath("//span[text()='Log out']")).click();
			wait.until(ExpectedConditions.titleIs(welcomePageTitle));
			System.out.println("Pass: The Home Page is Displayed upon Login and it is Verified upon the Checking the Title of the WebPage and Logged Out Successfully.");
		}else {
			System.out.println("Fail: The Home page is not displayed upon login and it is Verified.");
		}
		//POST-CONDITIONS
		//Minimize the Browser
		//Terminate the Browser API
		driver.manage().window().minimize();
		driver.quit();
	}
}
