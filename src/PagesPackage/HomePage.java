package PagesPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	WebDriver driver;
	WebDriverWait wait;
	final String url = "https://tvplus.com.tr";

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = wait;
		
	}
	
	

	@FindBy(xpath="//span[@class='logo-icon']")
	public
	WebElement TVIcon;
	@FindBy(xpath="//li[@id='menu-item-2039']//a")
	public
	WebElement NBAPlayoffs;
	//find all the elements in the homepage
	
	
	public void waitForLoad() {
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
	
	public void openHomePage() {
		driver.get(url);
	
		//waitForLoad();
	}
	
	public void clickNBAPlayoffsButton(){
		NBAPlayoffs.click();
		
	}
}
