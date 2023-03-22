package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCloseAndQuit {

	public static void main(String[] args) {
		//Set the Driver Executable Path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate Browser Specific Class
		WebDriver driver=new ChromeDriver();
		
		//Terminate the Entire Session
			//-Current Browser Window
			//-The respective Browser Driver Executable File
			//-Other Browser windows in the same session(Child Window)
		driver.quit();
		
		//Close the Browser window which is under the control of Driver Reference
			//-It will close the Default Window\
			//-It will not terminate the Driver Executable File
			//-We can witness this is in the Task Manager
		
		driver.close();
	}

}
