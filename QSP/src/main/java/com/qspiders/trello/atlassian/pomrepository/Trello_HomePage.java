package com.qspiders.trello.atlassian.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trello_HomePage {
	WebDriver driver;
	public void trelloHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement List 
	@FindBy (xpath = "//div[contains(@class,'BigNavstyles__NavBar')]//a[text()='Log in']")
	private WebElement loginLinkText;
	
	@FindBy(xpath = "//div[contains(@class,'Buttonsstyles__')]/a[text()='Get Trello for free']")
	private WebElement signUpLinkText;
	
	@FindBy(xpath = "//div[contains(@class,'Tabsstyles__TabGroup')]/button[text()='Features']")
	private WebElement featuresDropOptions;
	
	@FindBy(xpath = "//div[contains(@class,'Tabsstyles__TabGroup')]/button[text()='Solutions']")
	private WebElement solutionsDropOptions;
	
	@FindBy (xpath = "//div[contains(@class,'Tabsstyles__TabGroup')]/button[text()='Plans']")
	private WebElement plansDropOptions;
	
	@FindBy (xpath = "//div[contains(@class,'Tabsstyles__TabGroup')]/a[text()='Pricing']")
	private WebElement pricingLinkText;
	
	@FindBy (xpath ="//div[contains(@class,'Tabsstyles__TabGroup')]/button[text()='Resources']")
	private WebElement resourcesDropOptions;
	
	@FindBy(xpath = "//div[contains(@class,'grid__StyledColumn-sc-p40pqe-2 bVzHMy')]//input[@name='email']")
	private WebElement emailTextField_01;
	
	@FindBy (xpath = "//button[text()='Sign up - it’s free']")
	private WebElement signUpButton_01;
	
	@FindBy(xpath = "//a[contains(.,'Watch video')]")
	private WebElement watchVideoLink;
	
	//Method List
	public WebElement loginLinkText() {
		return loginLinkText;
	}
	
	public WebElement signUpLinkText() {
		return signUpLinkText;
	}
	
	public WebElement featuresDropOptions() {
		return featuresDropOptions;
	}
	
	public WebElement solutionsDropOptions() {
		return solutionsDropOptions;
	}
	
	public WebElement plansDropOptions() {
		return plansDropOptions;
	}
	
	public WebElement pricingLinkText() {
		return pricingLinkText;
	}
	
	public WebElement resourcesDropOptions() {
		return resourcesDropOptions;
	}
	
	public WebElement emailTextField_01() {
		return emailTextField_01;
	}
	
	public WebElement signUpButton_01() {
		return signUpButton_01;
	}
	
	public WebElement watchVideoLink() {
		return watchVideoLink;
	}
}
