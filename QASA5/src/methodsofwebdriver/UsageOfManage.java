package methodsofwebdriver;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfManage {

	public static void main(String[] args)  {
		//Set the Driver Executable Path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiate Browser Specific Class
		WebDriver driver=new ChromeDriver();
		
		//Maximizing the Browser Window is a Pre-Condition
		//Browser can Portray the Application with its Fullest Capacity
		//Browser Window to get fit into actual Screen Size
		driver.manage().window().maximize();
		
		//Pass the Main URL of the Application
		driver.get("https://www.incometax.gov.in/");
		
		//Dimension is a Selenium Concrete Class - getHeight() and getWidth() - int- Pixels
		Dimension windowSize = driver.manage().window().getSize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10)); 
		int windowHeight = windowSize.getHeight();
		System.out.println("windowHeight = "+ windowHeight + "Pixels");
		int windowWidth = windowSize.getWidth();
		System.out.println("windowWidth = " + windowWidth + "Pixels");
		
		//Point - is a Selenium Concrete Class - getX() getY() - int - Pixels
		//Both the Size and Position of the window will always be checked 
		//w.r.t to the child windows in the same Session
		
		Point windowPosition = driver.manage().window().getPosition();
		int windowXCoordinate = windowPosition.getX();
		System.out.println("windowXCoordinate = "+ windowXCoordinate + "Pixels");
		int windowYCoordinate = windowPosition.getY();
		System.out.println("windowYCoordinate = " + windowYCoordinate + "Pixels");
		
		//Post-Condition
		//This Post Condition has to be followed in all the Scripts
		//It is the Standard Practice to Minimize the Browser
		
		driver.manage().window().minimize();
		//Terminate the Session
		driver.quit();
		
	}

}
