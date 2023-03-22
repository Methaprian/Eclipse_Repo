package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {

	public static void main(String[] args) {
		
		//Set Driver Executable Path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiate Browser Specific Class
		ChromeDriver driver = new ChromeDriver();
		
		//Pass the Main URL of the APPLICATION
		driver.get("https://www.drdo.gov.in/");
		String expectedUrl="https://www.drdo.gov.in/";
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("windowHandle = " + windowHandle);
		System.out.println("windowHandles = " + windowHandles);
		
	}

}
