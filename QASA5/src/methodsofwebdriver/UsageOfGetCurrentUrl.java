package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {

	public static void main(String[] args) {
		
		//Set the Driver Executable Path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiate the Browser Specific Class
		ChromeDriver driver = new ChromeDriver();
		
		//Pass the Main URL of the APPLICATION
		//PROTOCOL MISSING - InvalidrgumentException
		driver.get("https://demo.actitime.com/");
		String expectedUrl="https://demo.actitime.com/login.do";
		System.out.println("expectedUrl = " + expectedUrl);
		
		//Capture the URL of the WebPage
		String actualUrl=driver.getCurrentUrl();
		System.out.println("actualUrl = " + actualUrl);
		
		//Comparing the Whole Object with Part Object
		//Whole Object - Object which is Under Testing
		//Part Object - Object which is Correct and found in Manual Test Case Data
		
		if (expectedUrl.equals(actualUrl)) {
			//Log Statement - Which always describes the Test Result Immediately for further Interpretation
			System.out.println("Pass : The Login Page URL is found Correct and Verified.");			
		}else {
			System.out.println("Fail : The Login Page URL is found Incorrect and Verified.");
		}
		
	}

}
