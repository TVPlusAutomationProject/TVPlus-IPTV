package PagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
		
	WebDriver driver;
	WebDriverWait wait;
	
		public BasePage(WebDriver driver, WebDriverWait wait) {
			
			this.driver = driver;
			this.wait = wait;
			PageFactory.initElements(driver, this);
			
		}
}
