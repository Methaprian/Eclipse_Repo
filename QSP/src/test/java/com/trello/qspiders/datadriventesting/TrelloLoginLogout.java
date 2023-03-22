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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloLoginLogout {
	//Making the driver as a GLOBAL VARIABLE(static)
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable, Throwable {
		//Creating the Properties type object to access the methods of Properties Class ---> java.util.Properties
		//Properties Class is responsible to Access the Key and Value provided in the properties file.
		Properties pobj = new Properties();
		//Passing the FileInputStream type object to the load().
		//This will load properties file from the specified path.
		pobj.load(new FileInputStream("./src/test/resources/trellocommondata.properties"));
		//getProperty() --> This method is from Properties Class.
		//Return Type ---> String
		//It fetches the value for the specific key from the properties file in the form of String.
		String browserName = pobj.getProperty("browser");
		//This else-if ladder executes in such a way that what whatever the browser is specified in the Properties file,
		//that will be compared and the respective browser specific class is Instantiated.
		//For each browser, the driver Executable path is set and respectively browser specific classes are Instantiated.
		if (browserName.equals("chrome")) {
			//FOR CHROME BROWSER
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browserName.equals("firefox")) {
			//FOR MOZILLA FIREFOX BROWSER
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}else if (browserName.equals("edge")) {
			//FOR MICROSOFT EDGE BROWSER
			System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		//PRE_CONDITIONS
		//Maximize the browser
		//Supply the Implicit wait for findElement() and findElements() methods
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Instantiate WebDriverWait class and pass the WebDriver reference for 1st Argument and Duration for 2nd Argument. 
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		//Fetch the URL from the PROPERTIES FILE using getProperty() and pass the fetched data to the get().
		driver.get(pobj.getProperty("url"));
		String expectedWelcomePageTitle="Manage Your Team’s Projects From Anywhere | Trello";
		//Supplying Explicit Wait till the title of the page is expectedWelcomePageTitle.
		wait.until(ExpectedConditions.titleIs(expectedWelcomePageTitle));
		//Identifying and Clicking onto the "Log In" option present is the Welcome Page.
		driver.findElement(By.xpath("//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[text()='Log in']")).click();
		WebElement usernameTextField = driver.findElement(By.id("user"));
		usernameTextField.clear();
		//Pass the Test Case Mail ID from the Properties File
		usernameTextField.sendKeys(pobj.getProperty("username"));
		//Click on Continue Button
		driver.findElement(By.id("login")).click();
		//Pass the Test Case Password
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		WebElement passwordTextfield = driver.findElement(By.id("password"));
		passwordTextfield.sendKeys(pobj.getProperty("password"));
		//Click on the Login Button
		//Here we are not using submit() because the <button> tag is not present in the <form> tag.
		//So we are using click() method.
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
			wait.until(ExpectedConditions.titleIs(expectedWelcomePageTitle));
			System.out.println("Pass: The Home Page is Displayed upon Login and it is Verified by Checking the Title of the WebPage and Logged Out Successfully.");
			//POST-CONDITIONS
			//Minimize the Browser
			//Terminate the Browser API
			driver.manage().window().minimize();
			driver.quit();
		}else {
			System.out.println("Fail: The Home page is not displayed upon login and it is Verified.");
		}
		
	}

}
