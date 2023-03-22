package methodsofwebdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {

	public static void main(String[] args) throws MalformedURLException, Throwable {
		//Set the Driver Executable Path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiate the Browser Specific Class
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Pass the main URL of the Application
		driver.get("http://texmin.nic.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='X']")).click();
		
		//Create a URL type Object
		//URL is Java class and it has Overloaded Constructors
		//We can build the URL dynamically
		
		URL mainUrl = new URL("http://texmin.nic.in/");
		URL notificationPage = new URL(mainUrl,"notification");
		URL policiesPage = new URL(mainUrl,"policies");
		
		//Navigating to the Notification Page with it's URL
		driver.navigate().to(notificationPage);
		
		//Reloading the Current Page
		driver.navigate().refresh();
		
		//Navigate to the Policies Page with it's URL
		driver.navigate().to(policiesPage);
		
		//Navigating to the Previous Web Page of the Same application in the Same Instance
		driver.navigate().back();
		
		//Navigating to the Next Subsequent WebPage of the Same Application in the Same Session
		driver.navigate().forward();
		
		//Terminate the Session
		driver.quit();
		
	}

}
