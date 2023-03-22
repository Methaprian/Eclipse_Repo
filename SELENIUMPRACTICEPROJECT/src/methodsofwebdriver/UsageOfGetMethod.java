package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://amazon.in/");
	}
		
}
