package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJet_CalenderPopup {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		Actions action = new Actions(driver);
		//action.moveByOffset(10, 10).click().perform();
		//roundTripCLick
		driver.findElement(By.xpath("//div[text()='round trip']/../..//div[@class='css-1dbjc4n r-zso239']")).click();
		//from
		String fromCity = "Beng";
		WebElement fromLoc = driver.findElement(By.xpath("//div[.='From']/following-sibling::div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"));
		fromLoc.click();
		action.sendKeys(fromLoc, fromCity).perform();
		//to
		Thread.sleep(3000);
		String toCity="Mang";
		WebElement toDest = driver.findElement(By.xpath("//div[.='To']/following-sibling::div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"));
		action.sendKeys(toDest, toCity).perform();
		//WebElement deptDate = driver.findElement(By.xpath("//div[.='Departure Date']/..//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"));
		//deptDate.click();
		String tDate = "20";
		String tMonth = "January";
		//String tDay="Tue";
		String tYear="2023";
		//String travelDate=tDay+", "+tDate+" "+tMonth+" "+tYear;
		String rDate="24";
		String rMonth = "February";
		//String rDay="Fri";
		String rYear="2023";
		//String returnDate=rDay+", "+rDate+" "+rMonth+" "+rYear;
		WebElement deptarture=driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+tMonth+"-"+tYear+"']//div[.='"+tDate+"' and @class='css-76zvg2 r-homxoj r-ubezar r-16dba41']"));
		action.click(deptarture).build().perform();
		for(;;) {
			try {
				WebElement returnTravel=driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+rMonth+"-"+rYear+"']//div[.='"+rDate+"' and @class='css-76zvg2 r-homxoj r-ubezar r-16dba41']"));
				returnTravel.click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//div[@class='r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']")).click();
			}
		}
		driver.findElement(By.xpath("//div[text()='Search Flight']/../..//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	}

}
