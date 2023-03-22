package methodsofwebdriver;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
	public static void main(String[] args) {
		//Set the Driver Executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//Pass the main URL of the Application
		driver.get("https://demoqa.com/browser-windows");
		//Capture the WindowID which is under Reference
		//Initially by default the driver reference will always lies with Parent Window
		String parentWindowId = driver.getWindowHandle();
		System.out.println("parentWindowId = "+ parentWindowId);
		//Identify New Window Button and Click on it
		driver.findElement(By.id("windowButton")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		
		for (String wid : allWindowId) {
			String actualUrl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println("actualUrl = " + actualUrl);
			if (actualUrl.equals("https://demoqa.com/sample")) {
				Dimension childWindowSize = driver.manage().window().getSize();
				System.out.println("childWindowSize = " + childWindowSize);
				//It will close the child window
				//driver.close();
			}
			//System.out.println(wid);
		}
		//driver.close();
		driver.quit();
			}
		}
	

