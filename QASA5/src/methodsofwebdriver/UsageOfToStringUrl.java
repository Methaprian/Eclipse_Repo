package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToStringUrl {

	public static void main(String[] args) throws Throwable {
		//Set the Driver Executable Path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiate the Browser Specific Class
		WebDriver driver= new ChromeDriver();
		
		//Pass the Main URL of the Application
		driver.get("https://www.facebook.com/");
		
		//Pass the Sub URL of the Application to(String Url)
		Thread.sleep(5000);
		
		//Navigate Directly with it's URL of the Respective Page of the Same Application
		driver.navigate().to("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
