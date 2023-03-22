package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		// Set the Driver Executable Path
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Instantiate Browser Specific Class
		
		ChromeDriver driver = new ChromeDriver();
	}

}
