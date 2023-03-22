package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethod {

	public static void main(String[] args) {
		
		//Step-1  Set the Driver Executable Path
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Step-2  Instantiate the Browser Specific Class
		
		ChromeDriver driver = new ChromeDriver();
		
		//Step-3  Pass the Main URL of the APPLICATION
		//InvalidArgumentException - Selenium Exception - Mistake in Main URL --> PROTOCOL://<DOMAIN NAME>
		//Unchecked Exception - Run Time
		//get()--> It is used to pass the Main URL of the APPLICATION
		//This has the default infinite waiting Capability until this WebPage is Loaded Completely
		
		driver.get("https://facebook.com/");
		
		
	}

}
