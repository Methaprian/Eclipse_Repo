package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {

	public static void main(String[] args) {
		
		//Set Driver Executable Path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiate Browser Specific Class
		ChromeDriver driver = new ChromeDriver();
		
		//Pass the Main URL of the APPLICATION
		driver.get("https://www.selenium.dev/");
		
		//Expected Correct Data form MANUAL TEST CASE for Verification and Validation
		String expectedTitle="Selenium";
		
		//I am Printing the Correct Data
		System.out.println("expectedTitle = " + expectedTitle);
		
		//Get the Title of the WebPage from the Application under Testing
		String actualTitle=driver.getTitle();
		System.out.println("actualTitle = " + actualTitle);
		
		//We are comparing both Expected and Actual one are according to Manual Test Case
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Pass : The Title of the WebPage is Correct and Verified.");
		}
		else {
			System.out.println("Pass : The Title of the WebPage is Correct and Verified.");
		}
	}
		
		
	}
	
		

	