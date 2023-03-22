package basics;

import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods {

	public static void main(String[] args) {
		Actions actions=new Actions(driver);
		actions.build();//Action Interface
		actions.click();//Actions Class
		actions.click(WebElement target);
		actions.clickAndHold();
		actions.clickAndHold(WebElement target);
		actions.contextClick();
		actions.contextClick(WebElement target);
		actions.doubleClick();
		actions.doubleClick(WebElement target);
		actions.dragAndDrop(WebElement source, WebElement target);
		actions.dragAndDropBy(WebElement source, int xOffset, int yOffset);
		actions.getActiveKeyboard();//KeyInput
		actions.getActivePointer();//PointerInput
		actions.getActiveWheel();//WheelInput
		actions.keyDown(CharSequence key);
		actions.keyDown(WebElement target, CharSequence key);
		actions.keyUp(CharSequence key);
		actions.keyUp(WebElement target, CharSequence key);
		actions.moveByOffset(int xOffset, int yOffset);
		actions.moveToElement(WebElement target);
		actions.moveToElement(WebElement target,int xOffset, int yOffset);
		actions.pause(Duration duration);
		actions.pause(long pause);
		actions.perform();//void
		actions.release();
		actions.release(WebElement target);
		actions.scrollByAmount(int xOffset,int yOffset);
		actions.scrollFromOrigin(ScrollOrigin scrollOrigin, int xOffset,int yOffset);
		actions.scrollToElement(WebElement element);
		actions.sendKeys(CharSequence... keys);
		actions.sendKeys(WebElement target, CharSequence... keys);
		actions.setActiveKeyboard(String name);
		actions.setActivePointer(Kind kind, String name);
		actions.setActiveWheel(String name);
		actions.tick(Interaction... actions);
	}

}
