package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		Select select=new Select(WebElement element);
		select.deselectAll();
		select.deselectByIndex(int index);
		select.deselectByValue(Sting value);
		select.deselectByVisibleText(String text);
		select.equals(Object o);
		select.getAllSelectedOptions();
		select.getFirstSelectedOption();
		select.getOptions();
		select.getWrappedElement();
		select.hashCode();
		select.isMultiple();
		select.selectByIndex(int index);
		select.selectByValue(String value);
		select.selectByVisibleText(String text);
	}

}
