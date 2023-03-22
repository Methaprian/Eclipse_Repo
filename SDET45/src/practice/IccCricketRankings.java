package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccCricketRankings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> teamNames = driver.findElements(By.xpath("//tbody//td[@class='table-body__cell rankings-table__team']"));
		List<WebElement> points = driver.findElements(By.xpath("//tbody//td[@class='table-body__cell u-center-text'][2]"));
		for (WebElement name : teamNames) {
			System.out.println(name.getText() +"  ");
			for (WebElement pts : points) {
				System.out.print(pts.getText());
			}
			
		}
		
	}
}
