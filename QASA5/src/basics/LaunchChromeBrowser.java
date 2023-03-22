package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		//Set Driver Executable Path
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiate the Browser Specific Class
	
		WebDriver driver = new ChromeDriver();
		
		
		
	}
}