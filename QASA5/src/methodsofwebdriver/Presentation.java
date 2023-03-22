package methodsofwebdriver;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Presentation {
public static void main(String[] args) throws MalformedURLException {
	//Set the Driver Executable Path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//Instantiate Browser Specific Class
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Dimension fb = driver.manage().window().getSize();
			System.out.println(fb);
			Point fb1=driver.manage().window().getPosition();
			System.out.println(fb1);
			driver.quit();
}
}
