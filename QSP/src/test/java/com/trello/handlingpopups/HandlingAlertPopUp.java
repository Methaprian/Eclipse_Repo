package com.trello.handlingpopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopUp {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("file:///C:/Users/METHAPRIAN%20S.K/Desktop/Testing%20Docs/PopUps/AlertPopUp.html");
		String alertText = driver.switchTo().alert().getText();

		Thread.sleep(3000);
		System.out.println("alertText = " + alertText);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
